# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#prog.
    def visitProg(self, ctx:ExprParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#TerminoComoExpr.
    def visitTerminoComoExpr(self, ctx:ExprParser.TerminoComoExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#SumaExpr.
    def visitSumaExpr(self, ctx:ExprParser.SumaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#RestaExpr.
    def visitRestaExpr(self, ctx:ExprParser.RestaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#MultiplicacionExplicita.
    def visitMultiplicacionExplicita(self, ctx:ExprParser.MultiplicacionExplicitaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#FactorComoTermino.
    def visitFactorComoTermino(self, ctx:ExprParser.FactorComoTerminoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#MultiplicacionImplicita.
    def visitMultiplicacionImplicita(self, ctx:ExprParser.MultiplicacionImplicitaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#FactorID.
    def visitFactorID(self, ctx:ExprParser.FactorIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#FactorNum.
    def visitFactorNum(self, ctx:ExprParser.FactorNumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#FactorParentesis.
    def visitFactorParentesis(self, ctx:ExprParser.FactorParentesisContext):
        return self.visitChildren(ctx)



del ExprParser