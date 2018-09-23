// Generated from /Users/stormcold/Desktop/Perx/Perx.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PerxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PerxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PerxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PerxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(PerxParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PerxParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(PerxParser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PerxParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PerxParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#ifelse_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse_stmt(PerxParser.Ifelse_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(PerxParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#boolean_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value(PerxParser.Boolean_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#whileloop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop_stmt(PerxParser.Whileloop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(PerxParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PerxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(PerxParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PerxParser#elsea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsea(PerxParser.ElseaContext ctx);
}