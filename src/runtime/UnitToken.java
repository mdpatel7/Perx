
/**
 * This class contains the methods to associate the token with a type and value.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 *
 */

public class UnitToken {
    TokenType type;
    String stringValue;

    /**
     * This constructor is used to assign a type and value to a unit of token.
     *
     * @param type      contains the type for the token
     * @param token     contains the value of the token
     */

    public UnitToken(TokenType type, String token) {
        this.type = type;
        this.stringValue = token;
    }
}