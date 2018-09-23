import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * This class PerxRunner contains the main() method and the execution of the compiler starts from here.
 * In the main() we call the lexer, parser, and generates the parse tree. We have created an instance
 * of PerxWalker which helps us walk through the nodes of the parse tree.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/29/2018
 */
public class PerxRunner {
    public static void main(String[] args) throws Exception {
        String filename = args[0];
        @SuppressWarnings("deprecation")
        PerxLexer lexer = new PerxLexer(new ANTLRFileStream(args[0]));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PerxParser parser = new PerxParser(tokens);
        ParseTree tree = parser.program(); // begin parsing at rule 'r'

        ParseTreeWalker walker = new ParseTreeWalker();

        filename = filename.substring(0, filename.length() - 5);
        PerxWalker per = new PerxWalker(filename);
        walker.walk(per, tree);
    }

}
