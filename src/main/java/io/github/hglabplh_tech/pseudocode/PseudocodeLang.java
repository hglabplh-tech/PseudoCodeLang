package io.github.hglabplh_tech.pseudocode;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import io.github.hglabplh_tech.PseudocodeParser;
import io.github.hglabplh_tech.pseudocode.listener.PseudoListen;
import io.github.hglabplh_tech.PseudocodeLexer;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Harald Glab-Plhak     */

public class PseudocodeLang {



        /**
         * Main Method
         *
         * @param args
         * @throws IOException
         */
        public static void main(String[] args) throws IOException {

            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("/home/leoks/EclipseIndigo/workspace2/SO/src/mypackage/MyVisitor.java")); // we'll
            // parse
            // this
            // file
            PseudocodeLexer lexer = new PseudocodeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PseudocodeParser parser = new PseudocodeParser(tokens);
            ParseTree pTree = parser.program().getParent();
            // starting point for
            // parsing a java file

            ParseTreeWalker walker = new ParseTreeWalker();
            ParseTreeListener listener = new PseudoListen();
            walker.walk(listener, pTree);

        }

}
