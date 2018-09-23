import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;

/**
 * This class PerxWalker helps us walk through all the nodes of the parse tree.
 * It contains the enter() and exit() for all the nodes of the parse tree.
 * The code for the action that we want to fire when a parse tree node is visited is
 * written in the corresponding enter() and exit() method for that node.
 *
 * @author Jay Patel
 * @author Vihar Bhatt
 * @author Meet Patel
 * @version 1.0
 * @since 04/14/2018
 */

public class PerxWalker extends PerxBaseListener {
    public StringBuilder sb = new StringBuilder();
    public String sourcewhile;
    public int count = 0;
    public int timer = 0;
    public int countif = 0;
    public int countelse = 0;
    String filename;
    public Stack<Integer> stack = new Stack<Integer>();

    PerxWalker(String x) {
        this.filename = x;
    }

    public void enterProgram(PerxParser.ProgramContext ctx) {
    }

    public void exitProgram(PerxParser.ProgramContext ctx) {
        String str = sb.toString();
        try {
            PrintWriter writer = new PrintWriter(filename + ".perxc", "UTF-8");
            writer.println(sb);
            writer.close();
        } catch (FileNotFoundException f) {
            System.out.println(f);

        } catch (UnsupportedEncodingException u) {
            System.out.println(u);

        }

    }

    public void enterStmt_block(PerxParser.Stmt_blockContext ctx) {

        if (sourcewhile != null && sourcewhile.equals("do") && timer == 0) {
            sb.append("START\n");
            timer = 1;
        }

        if (countif == 1) {
            sb.append("START\n");
        }
        if (countif == 0 && countelse == 1) {
            sb.append("F START\n");
        }


    }

    public void exitStmt_block(PerxParser.Stmt_blockContext ctx) {
        if (sourcewhile != null && sourcewhile.equals("do")) {
            sb.append("END\n");
        }
        if (countif == 1) {
            sb.append("END\n");
            countif--;
            return;
        }
        if (countif == 0 && countelse == 1) {
            sb.append("END\n");
            countelse = 0;
        }

        sourcewhile = null;

    }

    public void enterStmt(PerxParser.StmtContext ctx) {
    }

    public void exitStmt(PerxParser.StmtContext ctx) {
    }

    public void enterDecl_stmt(PerxParser.Decl_stmtContext ctx) {
        if (ctx.integer() != null) {
            sb.append("INT ");
        }
        if (ctx.bool() != null) {
            sb.append("BOOLEAN ");
        }
        sb.append(ctx.Identifier().getText());

    }

    public void exitDecl_stmt(PerxParser.Decl_stmtContext ctx) {

    }

    public void enterAssign_stmt(PerxParser.Assign_stmtContext ctx) {
        sb.append("ASSIGN" + " " + ctx.Identifier().getText() + " ");
    }

    public void exitAssign_stmt(PerxParser.Assign_stmtContext ctx) {

    }

    public void enterIfelse_stmt(PerxParser.Ifelse_stmtContext ctx) {
        sb.append("\nIF ");
        countif++;
        if (ctx.elsea() != null) {
            countelse++;
        }

    }

    public void exitIfelse_stmt(PerxParser.Ifelse_stmtContext ctx) {

    }

    public void enterWhileloop_stmt(PerxParser.Whileloop_stmtContext ctx) {
        sb.append("WHILE ");
        sourcewhile = "do";

    }

    public void exitWhileloop_stmt(PerxParser.Whileloop_stmtContext ctx) {
    }

    public void enterPrint_stmt(PerxParser.Print_stmtContext ctx) {
        sb.append("PRINT ");
    }

    public void exitPrint_stmt(PerxParser.Print_stmtContext ctx) {
    }

    public void enterBoolean_expression(PerxParser.Boolean_expressionContext ctx) {
        if (ctx.GREATER() != null) {
            sb.append("GREATER ");
            count++;
        }
        if (ctx.LESS() != null) {
            sb.append("LESSER ");
            count++;
        }
        if (ctx.EQUALTO() != null) {
            sb.append("EQUAL ");
            count++;
        }
        if (ctx.NOTEQUAL() != null) {
            sb.append("NOTEQUAL ");
            count++;
        }
        if (ctx.GREATEREQUAL() != null) {
            sb.append("GREATEREQUAL ");
            count++;
        }
        if (ctx.LESSEQUAL() != null) {
            sb.append("LESSEREQUAL ");
            count++;
        }
    }

    public void exitBoolean_expression(PerxParser.Boolean_expressionContext ctx) {
        sb.append("\n");
        sb.append("T ");
    }

    public void enterBoolean_value(PerxParser.Boolean_valueContext ctx) {
        count = 0;
    }

    public void exitBoolean_value(PerxParser.Boolean_valueContext ctx) {
    }

    public void enterExpression(PerxParser.ExpressionContext ctx) {


        if (ctx.ADD() != null) {

            sb.append("SUM ");
            count++;
        }
        if (ctx.SUB() != null) {

            sb.append("SUB ");
            count++;
        }
        if (ctx.MUL() != null) {

            sb.append("MULTIPLY ");
            count++;
        }
        if (ctx.DIV() != null) {
            sb.append("DIVIDE ");
            count++;
        }
        if (ctx.MOD() != null) {

            sb.append("MODULO ");
            count++;
        }
        if (ctx.Number() != null) {
            if (count > 0) {
                sb.append(ctx.Number().getText());
                sb.append(",");
                count--;
            } else {
                sb.append(ctx.Number().getText());
                sb.append(" ");
            }
        }
        if (ctx.Identifier() != null) {
            if (count > 0) {
                sb.append(ctx.Identifier().getText());
                sb.append(",");
                count--;
            } else {
                sb.append(ctx.Identifier().getText());
                sb.append(" ");
            }
        }


    }

    public void exitExpression(PerxParser.ExpressionContext ctx) {

    }

}
