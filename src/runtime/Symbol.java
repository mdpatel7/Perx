import java.util.List;

/**
 * The purpose of this class is to define the methods that help with the implementation of the
 * symbol table.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 *
 */

public class Symbol {
    private String symbolValue;
    private int symbolScope;
    private List<UnitToken> symbolValueList;

    /**
     * The constructors are used to provide a value and a scope to a symbol.
     *
     * @param symbolValue     contains the value to be assigned to the symbol
     * @param symbolScope     contains the scope to be assigned to the symbol
     */

    Symbol(String symbolValue, int symbolScope){
        this.symbolValue = symbolValue;
        this.symbolScope = symbolScope;
    }

    Symbol(List<UnitToken> symbolValue, int symbolScope){
        this.symbolValueList = symbolValue;
        this.symbolScope = symbolScope;
    }

    /**
     * This method is used to return the symbol value in the form of a string.
     *
     * @return     returns the symbol value   
     */

    public String getSymbolValue(){
        return this.symbolValue;
    }

    /**
     * This method is used to return the symbol value in the form of a list.
     *
     * @return     returns the symbol value in the form of a list     
     */

    public List<UnitToken> getSymbolValueList(){
        return this.symbolValueList;
    }

    /**
     * This method is used to return the symbol scope in the form of an integer.
     *
     * @return     returns the symbol scope in the form of an integer
     */

    public int getScopeValue(){
        return this.symbolScope;
    }

    /**
     * Used to display the output to the screen.
     *
     * @return     return the output string to the console.
     */

    @Override
    public String toString() {
        return "Scope : " + this.symbolScope + " -> Value : " + this.symbolValue + " | " + " -> Value : " + this.symbolValueList;
    }
}