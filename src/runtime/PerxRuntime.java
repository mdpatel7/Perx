
/**
 * This class contains the main(). Execution of the Perx language runtime starts from here.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 *
 */

public class PerxRuntime {
    public static void main(String args[]){
        runTime(args[0]);
    }

    /**
     *This method starts the Perx language virtual machine.
     *
     * @param icfilename     contains the name of the file containing intermediate code
     */

    private static void runTime(String icfilename){
        PerxVirtualMachine st = new PerxVirtualMachine(new Tokens(icfilename).getTokens());
    }
}

enum TokenType {
    STARTSTMTBLOCK("START")                   ,
    ENDSTMTBLOCK("END")                     ,
    COMMA(",")                          ,
    NUMBER ("[0-9]+")   ,
    BOOLEAN ( "T|F")             ,
    KEYWORDS("[A-Z][A-Z]*")      ,
    IDENTIFIER ( "[a-z]+")  ;

    public final String pattern;

    /**
     * The constructor assigns to the type of token, the regular expression pattern.
     *
     * @param pattern     contains the pattern of the regular expression of a given token type.
     */

    private TokenType(String pattern){
        this.pattern = pattern;
    }
}