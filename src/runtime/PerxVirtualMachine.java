import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * The purpose of this class is to implement the virtual machine.
 * It contains the methods to execute stacks, symbol tables and execute the
 * intermediate code being received from the file where the intermediate code is generated
 * after compilation.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 */

class PerxVirtualMachine {
    private boolean assignMarker = false;
    private boolean printMarker = false;
    private boolean printMarker1 = false;
    private boolean numberOperationMarker = false;
    private boolean comparisionOperationMarker = false;
    private boolean whileLoopMarker = false;
    private boolean whileLoopExecutionMarker = false;
    private boolean conditionMarker = false;
    private boolean endBlockExecution = false;
    private boolean returnMarker = false;

    private int numberoperationcode = 0;
    private int comparisoionOperationCode = 0;
    private int scope = 0;

    private String checkBlockExecution = "";
    private String returnValue = "";

    private HashMap<String, Symbol> symbolTable = new HashMap<String, Symbol>();
    private HashMap<String, Symbol> oldSymbolTableReference;

    private LinkedList<HashMap<String, Symbol>> symbolTableGlobal = new LinkedList<HashMap<String,Symbol>>();

    private Stack<String> stack = new Stack<String>();

    private ArrayList<String> parameterList = new ArrayList<String>();

    /**
     * The constructor of this class is used to create new symbol table for the tokens
     *
     * @param tokens                   contains the tokens to be stored
     * @param symbolTableRef           contains the reference of the old symbol table
     * @param symbolTableGlobalRef     contains the reference of the new symbol table
     */

    public PerxVirtualMachine(List<UnitToken> tokens, HashMap<String, Symbol> symbolTableRef, LinkedList<HashMap<String, Symbol>> symbolTableGlobalRef){
        this.symbolTableGlobal = symbolTableGlobalRef;
        this.symbolTable = symbolTableRef;
        this.init(tokens);
    }

    public PerxVirtualMachine(List<UnitToken> tokens){
        this.init(tokens);
    }

    /**
     * The method is used to process the tokens. It then generates the symbol table and execution.
     *
     * @param tokens     contains the tokens to be processes
     */

    private void init(List<UnitToken> tokens){
        int counter = 0;
        symbolTableGlobal.push(symbolTable);
        for(int i=0; i<tokens.size(); i++){
            UnitToken t = tokens.get(i);
            //         System.out.println(t.stringValue + " " + i);

            if(endBlockExecution){
                if(tokens.get(counter).type.toString().equals("ENDSTMTBLOCK")){
                    endBlockExecution = !endBlockExecution;
                }
                counter++;
                continue;
            }
            switch(t.type.toString()){
                case "KEYWORDS":
                    if(t.stringValue.equals("WHILE")){
                        if(tokens.get(counter+1).type.toString().equals("KEYWORDS")){
                            whileLoopMarker = true;
                        }
                    }
                    else {
                        keywords(t.stringValue);
                    }
                    break;

                case "IDENTIFIER":
                    stack.push(t.stringValue);
                    if(counter+1 < tokens.size()){
                        if(tokens.get(counter+1).type.toString().equals("COMMA")){
                            String stackSymbol = stack.pop();
                            for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
                                Symbol findSymbol = tempSymbolTable.get(stackSymbol);
                                if(findSymbol != null){
                                    parameterList.add(findSymbol.getSymbolValue());
                                    break;
                                }
                            }
                        }
                    }
                    break;

                case "NUMBER":
                    stack.push(t.stringValue);
                    if(counter+1 < tokens.size()){
                        if(tokens.get(counter+1).type.toString().equals("COMMA")){
                            parameterList.add(stack.pop());
                        }
                    }
                    break;

                case "STARTSTMTBLOCK":
                    if(whileLoopMarker){
                        if(!whileLoopExecutionMarker){
                            boolean foundLoopEnd = false;
                            while(!foundLoopEnd){
                                if(tokens.get(counter).stringValue.equals("END")){
                                    foundLoopEnd = true;
                                } else {
                                    counter++;
                                }
                            }
                            i = counter;
                        }
                    }
                    scope++;
                    oldSymbolTableReference = symbolTable;
                    symbolTable = new HashMap<String, Symbol>();
                    symbolTableGlobal.push(symbolTable);
                    break;

                case "ENDSTMTBLOCK":
                    scope--;
                    symbolTableGlobal.pop();
                    symbolTable = oldSymbolTableReference;
                    if(conditionMarker){
                        conditionMarker = false;
                    }
                    if(whileLoopExecutionMarker){
                        boolean foundLoopStart = false;
                        while(!foundLoopStart){
                            if(tokens.get(counter).stringValue.equals("WHILE")){
                                foundLoopStart = true;
                            } else {
                                counter--;
                            }
                        }
                        i = counter;
                    } else {
                        whileLoopMarker = false;
                    }
                    break;
            }
            if(assignMarker && stack.size() >= 2 && !(comparisionOperationMarker || numberOperationMarker)){
                doSetOperation();
                assignMarker = false;
            }
            if(printMarker && stack.size() >= 1){
                printToConsole();
            }
            if(returnMarker && stack.size() >= 1){
                setReturnValue();
            }
            if(conditionMarker){
                if(!comparisionOperationMarker){
                    if(stack.size() > 0){
                        if(stack.peek().equals("T") || stack.peek().equals("F")){
                            checkBlockExecution = stack.pop();
                        }
                    }
                }
                if(t.type.toString().equals("BOOLEAN")){
                    if(t.stringValue.equals(checkBlockExecution)){
                        endBlockExecution = false;
                    } else {
                        endBlockExecution = true;
                    }
                }
            }
            if(numberOperationMarker){
                if(counter+1 < tokens.size()){
                    if(tokens.get(counter+1).type.toString().equals("KEYWORDS") || tokens.get(counter+1).type.toString().equals("ENDSTMTBLOCK")){

                        //                   System.out.println("counter"+ counter);
                        doNumericOperation();

                        numberOperationMarker = false;
                    }
                } else {
                    doNumericOperation();
                    numberOperationMarker = false;
                }
            }
            if(comparisionOperationMarker){
                if(counter+1 < tokens.size()){
                    if(tokens.get(counter+1).type.toString().equals("KEYWORDS") || tokens.get(counter+1).type.toString().equals("BOOLEAN") || tokens.get(counter+1).type.toString().equals("STARTSTMTBLOCK")){
                        doCompOperation();
                        numberOperationMarker = false;
                    }
                } else {
                    doCompOperation();
                    numberOperationMarker = false;
                }
            }
            if(counter+1 < tokens.size()){
                if(tokens.get(counter+1).stringValue.equals("PRINT")){
                    printMarker1 = true;
                } else {
                    printMarker1 = false;
                }
            }
            counter++;
        }
        if(printMarker && stack.size() >= 1){
            printToConsole();
        }
        if(assignMarker && stack.size() >= 2){
            doSetOperation();
            assignMarker = false;
        }
    }

    /**
     * The method is used to fill the symbol table with symbol.
     *
     * @param symbolName     contains the name of the symbol to be put in the symbol table
     * @param symbol         an object of the Symbol class representing the symbol
     */

    private void insert(String symbolName, Symbol symbol){
        symbolTable.put(symbolName,symbol);
    }

    /**
     * This method is used to insert a symbol in the symbol table.
     *
     * @param scopedSymbolTable     contains the reference of the symbol table where symbol is to be inserted
     * @param symbolName            contains the symbol name
     * @param symbol                an object of the Symbol class representing the symbol
     */

    private void insertScoped(HashMap<String, Symbol> scopedSymbolTable, String symbolName, Symbol symbol){
        scopedSymbolTable.put(symbolName,symbol);
    }

    /**
     *  This method sets the return value of a function in a call stack
     *
     */

    private void setReturnValue(){
        String toReturn = "";
        String stackTop = stack.pop();
        boolean symbolFound = false;
        for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
            Symbol findSymbol = tempSymbolTable.get(stackTop);
            if(findSymbol != null){
                toReturn = findSymbol.getSymbolValue();
                symbolFound = true;
                break;
            }
        }
        if(!symbolFound){
            toReturn = stackTop;
        }
        returnValue = toReturn;
        returnMarker = false;
    }

    /**
     *  This method returns the return value of a function in a call stack
     *
     * @return      Returns the return value of any function on the call stack
     */

    public String getReturnValue(){
        return returnValue;
    }

    /**
     *  This method handles user input
     *
     */

    private void inputReader(){
        String userInput;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = br.readLine();
            stack.push(userInput);
        } catch (IOException ioe) {
            System.out.println("IO error!");
        }
    }

    /**
     * This method is used to print the results of the execution operations of the console.
     *
     */

    private void printToConsole(){
        if(!numberOperationMarker && !comparisionOperationMarker){
            String toPrint = stack.pop();
            boolean symbolFound = false;
            for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
                Symbol findSymbol = tempSymbolTable.get(toPrint);
                if(findSymbol != null){
                    System.out.println(findSymbol.getSymbolValue());
                    symbolFound = true;
                    break;
                }
            }
            if(!symbolFound){
                System.out.println(toPrint);
            }
            if(printMarker1)
                printMarker = true;
            else
                printMarker = false;
        }
    }

    /**
     * This method is used to set the values of the variables generated in our intermediate code.
     *
     */

    private void doSetOperation(){
        String value = stack.pop();
        String name = stack.pop();
        if(scope != 0){
            boolean symbolFound = false;
            for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
                Symbol findSymbol = tempSymbolTable.get(name);
                if(findSymbol != null){
                    insertScoped(tempSymbolTable,name,new Symbol(value,findSymbol.getScopeValue()));
                    symbolFound = true;
                    break;
                }
            }
            if(!symbolFound){
                insert(name,new Symbol(value,scope));
            }
        } else {
            boolean symbolFound = false;
            for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
                Symbol findSymbol = tempSymbolTable.get(name);
                if(findSymbol != null){
                    insertScoped(tempSymbolTable,name,new Symbol(value,findSymbol.getScopeValue()));
                    symbolFound = true;
                    break;
                }
            }

            if(!symbolFound){
                if(parameterList.size() == 0){
                    insert(name,new Symbol(value,scope));
                }
                else {
                    parameterList.add(value);
                    insert(name,new Symbol(parameterList.toString(),scope));
                    parameterList.clear();
                }
            }
        }
    }

    /**
     * This method is used to perform operations on the number data.
     *
     */

    private void doNumericOperation(){
        float result = 0;
        int count = 0;
        String value = stack.pop();
        boolean symbolFound = false;
        for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
            Symbol findSymbol = tempSymbolTable.get(value);
            if(findSymbol != null){
                parameterList.add(findSymbol.getSymbolValue());
                symbolFound = true;
                break;
            }
        }
        if(!symbolFound){
            parameterList.add(value);
        }
        for(String s:parameterList){
            if(count == 0){
                result = Float.parseFloat(s);
                count++;
                continue;
            }
            switch(numberoperationcode){
                case 1:
                    result = result + Float.parseFloat(s);
                    break;
                case 2:
                    result = result - Float.parseFloat(s);
                    break;
                case 3:
                    result = result * Float.parseFloat(s);
                    break;
                case 4:
                    result = result / Float.parseFloat(s);
                    break;
                case 5:
                    result = result % Float.parseFloat(s);
                    break;
            }
            count++;
        }
        stack.push(Float.toString(result));
        numberOperationMarker = false;
        parameterList.clear();
    }

    /**
     * This method is used to perform comparisons on valid data.
     *
     */

    private void doCompOperation(){
        String value = stack.pop();
        boolean symbolFound = false;
        for(HashMap<String, Symbol> tempSymbolTable : symbolTableGlobal){
            Symbol findSymbol = tempSymbolTable.get(value);
            if(findSymbol != null){
                parameterList.add(findSymbol.getSymbolValue());
                symbolFound = true;
                break;
            }
        }
        if(!symbolFound){
            parameterList.add(value);
        }
        boolean isFloat = false;
        String one = parameterList.get(parameterList.size() - 2);
        String two = parameterList.get(parameterList.size() - 1);
        float onef = 0;
        float twof = 0;
        if(isNumeric(one) && isNumeric(two))
        {
            onef = Float.parseFloat(one);
            twof = Float.parseFloat(two);
            isFloat = true;
        }
        switch(comparisoionOperationCode){
            case 1:
                if(isFloat){
                    if(onef < twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    System.out.println("Incomparable types");
                }
                break;
            case 2:
                if(isFloat){
                    if(onef > twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    System.out.println("Incomparable types");
                }
                break;
            case 3:
                if(isFloat){
                    if(onef >= twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    System.out.println("Incomparable types");
                }
                break;
            case 4:
                if(isFloat){
                    if(onef <= twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    System.out.println("Incomparable types");
                }
                break;
            case 5:
                if(isFloat){
                    if(onef == twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    if(one.equals(two))
                        stack.push("T");
                    else
                        stack.push("F");
                }
                break;
            case 6:
                if(isFloat){
                    if(onef != twof)
                        stack.push("T");
                    else
                        stack.push("F");
                } else {
                    if(!one.equals(two))
                        stack.push("T");
                    else
                        stack.push("F");
                }
                break;
        }
        comparisionOperationMarker = false;
        parameterList.clear();
        if(whileLoopMarker){
            if(stack.pop().equals("T")){
                whileLoopExecutionMarker = true;
            } else {
                whileLoopExecutionMarker = false;
            }
        }
    }

    /**
     * This method verifies if the string is a number type data.
     *
     * @param str     contains the string to be verified for the number type data.
     * @return        returns a boolean value indicating if the string checked is a number type data or not
     */

    private static boolean isNumeric(String str)
    {
        try
        {
            Float d = Float.parseFloat(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    /**
     * This method is used to perform operations on the predefined identifiers
     *
     * @param value     contains the value of the predefined identifier
     */

    private void keywords(String value){
        switch(value){
            case "ASSIGN":
                assignMarker = true;
                break;
            case "PRINT":
                printMarker = true;
                break;
            case "SUM":
                numberoperationcode = 1;
                numberOperationMarker = true;
                break;
            case "SUB":
                numberoperationcode = 2;
                numberOperationMarker = true;
                break;
            case "MULTIPLY":
                numberoperationcode = 3;
                numberOperationMarker = true;
                break;
            case "DIVIDE":
                numberoperationcode = 4;
                numberOperationMarker = true;
                break;
            case "MODULO":
                numberoperationcode = 5;
                numberOperationMarker = true;
                break;
            case "LESSER":
                comparisoionOperationCode = 1;
                comparisionOperationMarker = true;
                break;
            case "GREATER":
                comparisoionOperationCode = 2;
                comparisionOperationMarker = true;
                break;
            case "GREATEREQUAL":
                comparisoionOperationCode = 3;
                comparisionOperationMarker = true;
                break;
            case "LESSEREQUAL":
                comparisoionOperationCode = 4;
                comparisionOperationMarker = true;
                break;
            case "EQUAL":
                comparisoionOperationCode = 5;
                comparisionOperationMarker = true;
                break;
            case "NOTEQUAL":
                comparisoionOperationCode = 6;
                comparisionOperationMarker = true;
                break;
            case "IF":
                conditionMarker = true;
                break;

        }
    }
}
