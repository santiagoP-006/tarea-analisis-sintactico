// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TerminoComoExpr}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterTerminoComoExpr(ExprParser.TerminoComoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TerminoComoExpr}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitTerminoComoExpr(ExprParser.TerminoComoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaExpr}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterSumaExpr(ExprParser.SumaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaExpr}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitSumaExpr(ExprParser.SumaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorComoTermino}
	 * labeled alternative in {@link ExprParser#t}.
	 * @param ctx the parse tree
	 */
	void enterFactorComoTermino(ExprParser.FactorComoTerminoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorComoTermino}
	 * labeled alternative in {@link ExprParser#t}.
	 * @param ctx the parse tree
	 */
	void exitFactorComoTermino(ExprParser.FactorComoTerminoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link ExprParser#t}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(ExprParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link ExprParser#t}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(ExprParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorID}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFactorID(ExprParser.FactorIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorID}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFactorID(ExprParser.FactorIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorNum}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFactorNum(ExprParser.FactorNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorNum}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFactorNum(ExprParser.FactorNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorParentesis}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFactorParentesis(ExprParser.FactorParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorParentesis}
	 * labeled alternative in {@link ExprParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFactorParentesis(ExprParser.FactorParentesisContext ctx);
}