// Generated from Ambigua.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmbiguaParser}.
 */
public interface AmbiguaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmbiguaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AmbiguaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmbiguaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AmbiguaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterNumAmbigua(AmbiguaParser.NumAmbiguaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitNumAmbigua(AmbiguaParser.NumAmbiguaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterSumaAmbigua(AmbiguaParser.SumaAmbiguaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitSumaAmbigua(AmbiguaParser.SumaAmbiguaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMultAmbigua(AmbiguaParser.MultAmbiguaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultAmbigua}
	 * labeled alternative in {@link AmbiguaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMultAmbigua(AmbiguaParser.MultAmbiguaContext ctx);
}