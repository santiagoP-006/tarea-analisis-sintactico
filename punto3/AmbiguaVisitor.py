# Generated from Ambigua.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .AmbiguaParser import AmbiguaParser
else:
    from AmbiguaParser import AmbiguaParser

# This class defines a complete generic visitor for a parse tree produced by AmbiguaParser.

class AmbiguaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by AmbiguaParser#prog.
    def visitProg(self, ctx:AmbiguaParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AmbiguaParser#NumAmbigua.
    def visitNumAmbigua(self, ctx:AmbiguaParser.NumAmbiguaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AmbiguaParser#SumaAmbigua.
    def visitSumaAmbigua(self, ctx:AmbiguaParser.SumaAmbiguaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AmbiguaParser#MultAmbigua.
    def visitMultAmbigua(self, ctx:AmbiguaParser.MultAmbiguaContext):
        return self.visitChildren(ctx)



del AmbiguaParser