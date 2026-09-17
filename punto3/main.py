import sys
from antlr4 import InputStream, FileStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.DiagnosticErrorListener import DiagnosticErrorListener
from antlr4 import PredictionMode
from AmbiguaLexer import AmbiguaLexer
from AmbiguaParser import AmbiguaParser


class ContadorErrores(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errores = 0

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errores += 1
        print(f"  Error sintáctico en línea {line}, columna {column}: {msg}")


def procesar(entrada_stream, etiqueta):
    lexer = AmbiguaLexer(entrada_stream)
    tokens = CommonTokenStream(lexer)
    parser = AmbiguaParser(tokens)

    # Reemplaza el listener por defecto y agrega el diagnóstico de ambigüedad
    parser.removeErrorListeners()
    contador = ContadorErrores()
    parser.addErrorListener(contador)
    parser.addErrorListener(DiagnosticErrorListener())

    # Modo de predicción que detecta y reporta ambigüedades exactas
    parser._interp.predictionMode = PredictionMode.LL_EXACT_AMBIG_DETECTION

    parser.prog()

    if contador.errores == 0:
        print(f"  ACEPTADA (ambigüedad resuelta por ANTLR): '{etiqueta}'")
    else:
        print(f"  RECHAZADA: '{etiqueta}' ({contador.errores} error(es))")


def main():
    if len(sys.argv) < 2:
        texto = input("Ingrese la expresión: ")
        entrada = InputStream(texto)
        procesar(entrada, texto)
    elif sys.argv[1] == '-f':
        if len(sys.argv) < 3:
            print("Error: falta la ruta del archivo tras -f")
            sys.exit(1)
        ruta = sys.argv[2]
        entrada = FileStream(ruta, encoding='utf-8')
        procesar(entrada, f"archivo:{ruta}")
    else:
        texto = sys.argv[1]
        entrada = InputStream(texto)
        procesar(entrada, texto)


if __name__ == '__main__':
    main()
