// Generated from LuaPreProc.g4 by ANTLR 4.9.1
package com.dynamo.bob.pipeline.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaPreProcParser}.
 */
public interface LuaPreProcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#codefile}.
	 * @param ctx the parse tree
	 */
	void enterCodefile(LuaPreProcParser.CodefileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#codefile}.
	 * @param ctx the parse tree
	 */
	void exitCodefile(LuaPreProcParser.CodefileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#preproc}.
	 * @param ctx the parse tree
	 */
	void enterPreproc(LuaPreProcParser.PreprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#preproc}.
	 * @param ctx the parse tree
	 */
	void exitPreproc(LuaPreProcParser.PreprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(LuaPreProcParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(LuaPreProcParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#ifdef}.
	 * @param ctx the parse tree
	 */
	void enterIfdef(LuaPreProcParser.IfdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#ifdef}.
	 * @param ctx the parse tree
	 */
	void exitIfdef(LuaPreProcParser.IfdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#elsedef}.
	 * @param ctx the parse tree
	 */
	void enterElsedef(LuaPreProcParser.ElsedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#elsedef}.
	 * @param ctx the parse tree
	 */
	void exitElsedef(LuaPreProcParser.ElsedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#endif}.
	 * @param ctx the parse tree
	 */
	void enterEndif(LuaPreProcParser.EndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#endif}.
	 * @param ctx the parse tree
	 */
	void exitEndif(LuaPreProcParser.EndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaPreProcParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LuaPreProcParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaPreProcParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LuaPreProcParser.LineContext ctx);
}