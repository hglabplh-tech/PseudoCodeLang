package io.github.hglabplh_tech.pseudocode.listener;

import org.antlr.v4.runtime.ParserRuleContext;

public class PseudoASTCtx {
    private OpContext actContext;

    public PseudoASTCtx(ParserRuleContext startCtx) {
        this.actContext = new OpContext(startCtx);
    }
    OpContext getOpContext() {
        return this.actContext;
    }

    OpContext copyAndUpdateOpContext(Integer blockNestingChange, BlockType blockType) {
        OpContext temp = this.getOpContext();
        return null;
    }

    enum BlockType {
        NONE
    }

    public class OpContext {
        private Integer blockNesting = 0;
        private BlockType blockType = BlockType.NONE;
        private ParserRuleContext pContext;

        public OpContext(ParserRuleContext pContext) {
            this.pContext = pContext;
        }

        public OpContext(OpContext context) {

        }

    }
}
