import sys
from antlr4 import InputStream, FileStream, CommonTokenStream
from AmbiguaLexer import AmbiguaLexer
from AmbiguaParser import AmbiguaParser
from AmbiguaEvalVisitor import AmbiguaEvalVisitor


def procesar(entrada_stream, etiqueta):
    lexer = AmbiguaLexer(entrada_stream)
    tokens = CommonTokenStream(lexer)
    parser = AmbiguaParser(tokens)
    arbol = parser.prog()

    print(f"'{etiqueta}'")
    print(f"  Árbol : {arbol.toStringTree(recog=parser)}")

    visitor = AmbiguaEvalVisitor()
    resultado = visitor.visit(arbol)
    print(f"  Valor : {resultado}")


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
