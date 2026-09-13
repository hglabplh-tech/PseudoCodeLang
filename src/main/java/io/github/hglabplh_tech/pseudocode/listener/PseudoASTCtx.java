package io.github.hglabplh_tech.pseudocode.listener;

import io.github.hglabplh_tech.PseudocodeParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Objects;

public class PseudoASTCtx {
    private PseudoAST lastContext = null;
    private PseudoAST actContext;

    public PseudoASTCtx(ParserRuleContext startCtx) {
        this.actContext = getRootNode(startCtx);
    }

   PseudoAST getActOpContext() {
        return this.actContext;
    }

    PseudoAST addLeft(ParserRuleContext ruleCtx, boolean incrementNesting, BlockType blockType) {
        PseudoAST save = this.actContext;
        Integer blockNesting = this.actContext.leaf().blockNesting();
        io.github.hglabplh_tech.pseudocode.listener.PseudoASTCtx.OpContext opCtx =
                initializedBuilder(new OpContext(ruleCtx, blockNesting, blockType), blockType, incrementNesting).build();
        this.actContext = PseudoAST.makeLeft(save, opCtx);
        return save;
    }

    PseudoAST addRight(ParserRuleContext ruleCtx, boolean incrementNesting, BlockType blockType) {
        PseudoAST save = this.actContext;
        Integer blockNesting = this.actContext.leaf().blockNesting();
        io.github.hglabplh_tech.pseudocode.listener.PseudoASTCtx.OpContext opCtx =
                initializedBuilder(new OpContext(ruleCtx, blockNesting, blockType), blockType, incrementNesting).build();
        this.actContext = PseudoAST.makeRight(save, opCtx);
        return save;
    }

    public static OpContext.Builder initializedBuilder(OpContext context, BlockType type, boolean incrementBlockNesting) {
        OpContext.Builder builder = new OpContext.Builder(context);
        builder = builder.blockType(type);
        if (incrementBlockNesting) {
            builder.incrementBlockNesting();
        } else {
            builder.decrementBlockNesting();
        }
        return builder;
    }

    PseudoAST copyAndUpdateOpContext(PseudoAST nodeLeaf, boolean incrementNesting,
                                     BlockType blockType, ParserRuleContext ruleCtx) {
        OpContext temp = this.getActOpContext().leaf();
        OpContext newCtx = initializedBuilder(temp, blockType, incrementNesting).pContext(ruleCtx).build();
        return nodeLeaf.setInstanceDataBang(newCtx, nodeLeaf.root(), nodeLeaf.parent(), nodeLeaf.left(), nodeLeaf.right());
    }

    enum BlockType {
        PROGRAM_BLOCK,
        COND_BLOCK,
        LOOP_BLOCK,
        PROC_FUN_BLOCK,
        NONE;
    }

    public static class OpContext {
        final private Integer blockNesting;
        final private BlockType blockType;
        final private ParserRuleContext pContext;

        public OpContext(ParserRuleContext pContext, Integer blockNesting, BlockType blockType) {
            this.pContext = pContext;
            this.blockNesting = blockNesting;
            this.blockType = blockType;
        }

        public OpContext(ParserRuleContext pContext) {
            this.pContext = pContext;
            this.blockNesting = 0;
            this.blockType = BlockType.NONE;
        }

        public Integer blockNesting() {
            return this.blockNesting;
        }

        public BlockType blockType() {
            return this.blockType;
        }

        public ParserRuleContext pContext() {
            return this.pContext;
        }

        static class Builder {
            private OpContext context = null;
            private Integer blockNesting = 0;
            private BlockType blockType = BlockType.NONE;
            private ParserRuleContext pContext = null;

            public Builder() {

            }

            public Builder(OpContext context) {
                this.context = context;
            }

            public Builder pContext(ParserRuleContext pContext) {
                this.pContext = pContext;
                return this;
            }

            public Builder incrementBlockNesting() {
                this.blockNesting++;
                return this;
            }

            public Builder blockType(BlockType type) {
                this.blockType = type;
                return this;
            }

            public Builder decrementBlockNesting() {
                this.blockNesting--;
                return this;
            }

            OpContext build() {
                return Objects.requireNonNullElseGet(context, ()
                        -> new OpContext(this.pContext, this.blockNesting, this.blockType));
            }
        }
    }

    /**
     *
     */
    public static class PseudoAST {

        /** leaf node data */
        private OpContext leaf;

        /** The root */
        private PseudoAST root;

        /** The parent node */
        private PseudoAST parent;

        /** the left child node */
        private PseudoAST left;

        /* the right child node*/
        private PseudoAST right;

        public PseudoAST(OpContext leaf, PseudoAST parent, PseudoAST left, PseudoAST right) {
            this.leaf = leaf;
            this.parent = parent;
            if (parent == null) {
                this.root = this;
            } else {
                this.root = parent.root;
            }
            this.left = left;
            this.right = right;
        }

        public PseudoAST setInstanceDataBang(OpContext leaf, PseudoAST root, PseudoAST parent, PseudoAST left, PseudoAST right) {
            this.leaf = leaf;
            this.root = root;
            this.parent = parent;
            this.left = left;
            this.right = right;
            return this;
        }

        public static PseudoAST makeRoot(OpContext leaf) {
            return new PseudoAST(leaf, null, null, null);
        }

        /**
         * make a right leaf
         * @param parent the parent node
         * @param leaf the leaf
         * @return the left element
         */
        public static PseudoAST makeRight(PseudoAST parent, OpContext leaf) {
            return setRight(parent, new PseudoAST(leaf, parent, null, null));

        }

        /**
         * make a left leaf
         * @param parent the parent node
         * @param leaf the leaf
         * @return the left element
         */
        public static PseudoAST makeLeft(PseudoAST parent, OpContext leaf) {
            return setLeft(parent, new PseudoAST(leaf, parent, null, null));
        }

        /**
         * set left
         * - set the left reference
         * - private because set has not to be used by the user
         * @param parent the parent
         * @param left the left leaf
         * @return the left reference
         */
        private static PseudoAST setLeft(PseudoAST parent, PseudoAST left) {
            parent.left = left;
            return parent.left;
        }

        /**
         * set right
         * - set the right reference
         * - private because set has not to be used by the user
         * @param parent the parent
         * @param right the right leaf
         * @return the right reference
         */
        private static PseudoAST setRight(PseudoAST parent, PseudoAST right) {
            parent.right = right;
            return parent.right;
        }

        private static PseudoAST setParent(PseudoAST act, PseudoAST parent) {
            act.parent = parent;
            return parent;
        }

        private static OpContext setLeaf(PseudoAST parent, OpContext actOpCtx) {
            parent.leaf = actOpCtx;
            return actOpCtx;
        }

        /*
        The GETTERS
         */

        /**
         * the leaf getter
         * @return leaf
         */
        public OpContext leaf() {
            return leaf;
        }

        /**
         * root getter
         * @return root element
         */
        public PseudoAST root() {
            return root;
        }


        /**
         * parent getter
         * @return the parent
         */
        public PseudoAST parent() {
            return parent;
        }

        /**
         * The left child getter
         * @return left child
         */
        public PseudoAST left() {
            return left;
        }

        /**
         * The right child getter
         * @return right child
         */
        public PseudoAST right() {
            return right;
        }
    }

    public static ThreadLocal<PseudoAST> rootNode = new ThreadLocal<>();
    public static PseudoAST getRootNode(ParserRuleContext context) {
        PseudoAST root;
        if (rootNode.get() == null) {
            root = PseudoAST.makeRoot(new OpContext(context, 0, BlockType.PROGRAM_BLOCK));
            rootNode.set(root);
            return root;
        } else {
            return rootNode.get();
        }
    }

}
