# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#prog.
    def enterProg(self, ctx:ExprParser.ProgContext):
        pass

    # Exit a parse tree produced by ExprParser#prog.
    def exitProg(self, ctx:ExprParser.ProgContext):
        pass


    # Enter a parse tree produced by ExprParser#TerminoComoExpr.
    def enterTerminoComoExpr(self, ctx:ExprParser.TerminoComoExprContext):
        pass

    # Exit a parse tree produced by ExprParser#TerminoComoExpr.
    def exitTerminoComoExpr(self, ctx:ExprParser.TerminoComoExprContext):
        pass


    # Enter a parse tree produced by ExprParser#SumaExpr.
    def enterSumaExpr(self, ctx:ExprParser.SumaExprContext):
        pass

    # Exit a parse tree produced by ExprParser#SumaExpr.
    def exitSumaExpr(self, ctx:ExprParser.SumaExprContext):
        pass


    # Enter a parse tree produced by ExprParser#RestaExpr.
    def enterRestaExpr(self, ctx:ExprParser.RestaExprContext):
        pass

    # Exit a parse tree produced by ExprParser#RestaExpr.
    def exitRestaExpr(self, ctx:ExprParser.RestaExprContext):
        pass


    # Enter a parse tree produced by ExprParser#MultiplicacionExplicita.
    def enterMultiplicacionExplicita(self, ctx:ExprParser.MultiplicacionExplicitaContext):
        pass

    # Exit a parse tree produced by ExprParser#MultiplicacionExplicita.
    def exitMultiplicacionExplicita(self, ctx:ExprParser.MultiplicacionExplicitaContext):
        pass


    # Enter a parse tree produced by ExprParser#FactorComoTermino.
    def enterFactorComoTermino(self, ctx:ExprParser.FactorComoTerminoContext):
        pass

    # Exit a parse tree produced by ExprParser#FactorComoTermino.
    def exitFactorComoTermino(self, ctx:ExprParser.FactorComoTerminoContext):
        pass


    # Enter a parse tree produced by ExprParser#MultiplicacionImplicita.
    def enterMultiplicacionImplicita(self, ctx:ExprParser.MultiplicacionImplicitaContext):
        pass

    # Exit a parse tree produced by ExprParser#MultiplicacionImplicita.
    def exitMultiplicacionImplicita(self, ctx:ExprParser.MultiplicacionImplicitaContext):
        pass


    # Enter a parse tree produced by ExprParser#FactorID.
    def enterFactorID(self, ctx:ExprParser.FactorIDContext):
        pass

    # Exit a parse tree produced by ExprParser#FactorID.
    def exitFactorID(self, ctx:ExprParser.FactorIDContext):
        pass


    # Enter a parse tree produced by ExprParser#FactorNum.
    def enterFactorNum(self, ctx:ExprParser.FactorNumContext):
        pass

    # Exit a parse tree produced by ExprParser#FactorNum.
    def exitFactorNum(self, ctx:ExprParser.FactorNumContext):
        pass


    # Enter a parse tree produced by ExprParser#FactorParentesis.
    def enterFactorParentesis(self, ctx:ExprParser.FactorParentesisContext):
        pass

    # Exit a parse tree produced by ExprParser#FactorParentesis.
    def exitFactorParentesis(self, ctx:ExprParser.FactorParentesisContext):
        pass



del ExprParser