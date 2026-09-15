from AmbiguaVisitor import AmbiguaVisitor


class AmbiguaEvalVisitor(AmbiguaVisitor):

    def visitProg(self, ctx):
        return self.visit(ctx.e())

    # e : e '+' e   # SumaAmbigua
    def visitSumaAmbigua(self, ctx):
        izquierda = self.visit(ctx.e(0))
        derecha = self.visit(ctx.e(1))
        return izquierda + derecha

    # e : e '*' e   # MultAmbigua
    def visitMultAmbigua(self, ctx):
        izquierda = self.visit(ctx.e(0))
        derecha = self.visit(ctx.e(1))
        return izquierda * derecha

    # e : NUM       # NumAmbigua
    def visitNumAmbigua(self, ctx):
        texto = ctx.NUM().getText()
        if '.' in texto:
            return float(texto)
        return int(texto)
