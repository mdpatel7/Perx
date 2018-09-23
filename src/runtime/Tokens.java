import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains methods that are used to create tokens from the data obtained from the file 
 * containing the intermediate code.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 */

public class Tokens {
    private List<UnitToken> tokens = new ArrayList<UnitToken>();
    private Pattern patern;
    private Matcher matcher;

    /**
     * This constructor is used to generate the patterns according to the regular expressions of a given
     * token type. It then creates the tokens from intermediate code file as per the pattern.
     *
     * @param icfilename     contains the intermediate code containing file name
     */

    public Tokens(String icfilename){
        StringBuilder regex = new StringBuilder();
        for (TokenType t: TokenType.values()) {
            regex.append("|(?<").append(t.name()).append(">").append(t.pattern).append(")");
        }
        patern = Pattern.compile(regex.substring(1));
        try (BufferedReader br = new BufferedReader(new FileReader(icfilename))) {
            String line;
            while ((line = br.readLine()) != null) {
                tokenize(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * This method accepts the data from the intermediate code containing file. It associates the 
     * with the tokens according to the pattern and assign to a token a type and value.
     *
     * @param line     contains the line from the intermediate code containing file that is to be tokenized
     */

    private void tokenize(String line){
        matcher = patern.matcher(line);
        while (matcher.find()) {
            String tokenValue;
            for (TokenType tokentype : TokenType.values()){
                if ( (tokenValue = matcher.group(tokentype.name())) != null) {
                    tokens.add(new UnitToken(tokentype, tokenValue));
                    break;
                }
            }
        }
    }

    /**
     * This method is used to return the list of tokens generated.
     *
     * @return     returns the Tokens List
     */

    public List<UnitToken> getTokens(){
        return this.tokens;
    }
}