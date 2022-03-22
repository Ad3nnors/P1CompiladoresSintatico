// Generated from psintatico\P.g4 by ANTLR 4.7.2
package psintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PParser}.
 */
public interface PListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(PParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(PParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(PParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(PParser.TermoContext ctx);
}