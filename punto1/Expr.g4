grammar Expr;

prog
    : e EOF
    ;

e
    : e '+' t   # SumaExpr
    | e '-' t   # RestaExpr
    | t         # TerminoComoExpr
    ;

t
    : t f       # MultiplicacionImplicita
    | t '*' f   # MultiplicacionExplicita
    | f         # FactorComoTermino
    ;

f
    : ID              # FactorID
    | NUM             # FactorNum
    | '(' e ')'       # FactorParentesis
    ;

ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
NUM : [0-9]+ ('.' [0-9]+)? ;
WS  : [ \t\r\n]+ -> skip ;
