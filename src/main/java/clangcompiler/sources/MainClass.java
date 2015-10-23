package clangcompiler.sources;

import clangcompiler.antlr.CGrammarLexer;
import clangcompiler.antlr.CGrammarParser;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 *
 * @author vlad
 */
public class MainClass {
    public static void main(String[] args) {
        String filepath = "./Input.txt";
        try {
            CharStream input = (CharStream) new ANTLRFileStream(filepath);
            CGrammarLexer lexer = new CGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CGrammarParser parser = new CGrammarParser(tokens);
            Tree program = (Tree) parser.execute().getTree();
            AstNodePrinter.print(program);
        } catch (Exception ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}