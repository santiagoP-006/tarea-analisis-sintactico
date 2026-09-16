import sys
from antlr4 import InputStream, FileStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener
from ExprLexer import ExprLexer
from ExprParser import ExprParser


class ContadorErrores(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errores = 0

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errores += 1
        print(f"  Error sintáctico en línea {line}, columna {column}: {msg}")


def procesar(entrada_stream, etiqueta):
    lexer = ExprLexer(entrada_stream)
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)

    # Reemplazar el listener por defecto con nuestro contador
    parser.removeErrorListeners()
    listener = ContadorErrores()
    parser.addErrorListener(listener)

    parser.prog()

    if listener.errores == 0:
        print(f"  ACEPTADA: '{etiqueta}'")
    else:
        print(f"  RECHAZADA: '{etiqueta}' ({listener.errores} error(es))")


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
