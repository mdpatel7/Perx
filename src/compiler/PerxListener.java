// Generated from /Users/stormcold/Desktop/Perx/Perx.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PerxParser}.
 */
public interface PerxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PerxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PerxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PerxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(PerxParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(PerxParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PerxParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PerxParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmt(PerxParser.Decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmt(PerxParser.Decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PerxParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PerxParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PerxParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PerxParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#ifelse_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfelse_stmt(PerxParser.Ifelse_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#ifelse_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfelse_stmt(PerxParser.Ifelse_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(PerxParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(PerxParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(PerxParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(PerxParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#whileloop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop_stmt(PerxParser.Whileloop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#whileloop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop_stmt(PerxParser.Whileloop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(PerxParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(PerxParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PerxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PerxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(PerxParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(PerxParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PerxParser#elsea}.
	 * @param ctx the parse tree
	 */
	void enterElsea(PerxParser.ElseaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PerxParser#elsea}.
	 * @param ctx the parse tree
	 */
	void exitElsea(PerxParser.ElseaContext ctx);
}