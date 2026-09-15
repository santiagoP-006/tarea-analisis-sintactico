# Generated from Ambigua.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .AmbiguaParser import AmbiguaParser
else:
    from AmbiguaParser import AmbiguaParser

# This class defines a complete listener for a parse tree produced by AmbiguaParser.
class AmbiguaListener(ParseTreeListener):

    # Enter a parse tree produced by AmbiguaParser#prog.
    def enterProg(self, ctx:AmbiguaParser.ProgContext):
        pass

    # Exit a parse tree produced by AmbiguaParser#prog.
    def exitProg(self, ctx:AmbiguaParser.ProgContext):
        pass


    # Enter a parse tree produced by AmbiguaParser#NumAmbigua.
    def enterNumAmbigua(self, ctx:AmbiguaParser.NumAmbiguaContext):
        pass

    # Exit a parse tree produced by AmbiguaParser#NumAmbigua.
    def exitNumAmbigua(self, ctx:AmbiguaParser.NumAmbiguaContext):
        pass


    # Enter a parse tree produced by AmbiguaParser#SumaAmbigua.
    def enterSumaAmbigua(self, ctx:AmbiguaParser.SumaAmbiguaContext):
        pass

    # Exit a parse tree produced by AmbiguaParser#SumaAmbigua.
    def exitSumaAmbigua(self, ctx:AmbiguaParser.SumaAmbiguaContext):
        pass


    # Enter a parse tree produced by AmbiguaParser#MultAmbigua.
    def enterMultAmbigua(self, ctx:AmbiguaParser.MultAmbiguaContext):
        pass

    # Exit a parse tree produced by AmbiguaParser#MultAmbigua.
    def exitMultAmbigua(self, ctx:AmbiguaParser.MultAmbiguaContext):
        pass



del AmbiguaParser