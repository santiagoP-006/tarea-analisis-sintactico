from ExprVisitor import ExprVisitor


class ExprEvalVisitor(ExprVisitor):

    def visitProg(self, ctx):
        return self.visit(ctx.e())

    # e : e '+' t   # SumaExpr
    def visitSumaExpr(self, ctx):
        izquierda = self.visit(ctx.e())
        derecha = self.visit(ctx.t())
        return izquierda + derecha

    # e : e '-' t   # RestaExpr
    def visitRestaExpr(self, ctx):
        izquierda = self.visit(ctx.e())
        derecha = self.visit(ctx.t())
        return izquierda - derecha

    # e : t         # TerminoComoExpr
    def visitTerminoComoExpr(self, ctx):
        return self.visit(ctx.t())

    # t : t f       # MultiplicacionImplicita
    def visitMultiplicacionImplicita(self, ctx):
        izquierda = self.visit(ctx.t())
        derecha = self.visit(ctx.f())
        return izquierda * derecha

    # t : t '*' f   # MultiplicacionExplicita
    def visitMultiplicacionExplicita(self, ctx):
        izquierda = self.visit(ctx.t())
        derecha = self.visit(ctx.f())
        return izquierda * derecha

    # t : f         # FactorComoTermino
    def visitFactorComoTermino(self, ctx):
        return self.visit(ctx.f())

    # f : ID        # FactorID
    def visitFactorID(self, ctx):
        # No hay tabla de símbolos definida aún; se reporta el error
        nombre = ctx.ID().getText()
        raise ValueError(f"Identificador '{nombre}' no tiene valor asignado (no hay tabla de símbolos)")

    # f : NUM       # FactorNum
    def visitFactorNum(self, ctx):
        texto = ctx.NUM().getText()
        if '.' in texto:
            return float(texto)
        return int(texto)

    # f : '(' e ')' # FactorParentesis
    def visitFactorParentesis(self, ctx):
        return self.visit(ctx.e())
