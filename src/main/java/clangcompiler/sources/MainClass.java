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
    
    public static Tree check(String src, Context context) throws RecognitionException, Exception
    {
        CharStream input = new ANTLRStringStream(src);
        CGrammarLexer lexer = new CGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CGrammarParser parser = new CGrammarParser(tokens);
        parser.setTreeAdaptor(new AstNodeTreeAdapter());
        Tree program = (AstNode)parser.execute().getTree();
        SemanticChecker.check((AstNode)program, context);
        return program;
    }
    
    public static void main(String[] args) {
        String filepath = "./Input.txt";
        try {
            Context context = new Context(null);
            String src = 
                        "double sin(double a) { } " +
                        "double cos(double a) { } " +
                        "double sqrt(double a) { } " +
                        "double sqr(double a) { } ";
            check(src, context);
            
            CharStream input = (CharStream) new ANTLRFileStream(filepath);
            CGrammarLexer lexer = new CGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CGrammarParser parser = new CGrammarParser(tokens);
            parser.setTreeAdaptor(new AstNodeTreeAdapter());
            AstNode program = (AstNode) parser.execute().getTree();
            AstNodePrinter.print(program);
            System.out.println();
            SemanticChecker.check((AstNode) program, context);
            AstNodePrinter.print(program);
        } catch (Exception ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}