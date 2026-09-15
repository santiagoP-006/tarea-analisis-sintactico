# main.py

import sys
from antlr4 import InputStream, FileStream, CommonTokenStream
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprEvalVisitor import ExprEvalVisitor


def procesar(entrada_stream, etiqueta):
    lexer = ExprLexer(entrada_stream)
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    arbol = parser.prog()

    print(f"'{etiqueta}'")
    print(f"  Árbol : {arbol.toStringTree(recog=parser)}")

    try:
        visitor = ExprEvalVisitor()
        resultado = visitor.visit(arbol)
        print(f"  Valor : {resultado}")
    except ValueError as e:
        print(f"  Valor : ERROR - {e}")


def main():
    if len(sys.argv) < 2:
        texto = input(" ")
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
