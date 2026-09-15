grammar Ambigua;

prog
    : e EOF
    ;

e
    : e '+' e   # SumaAmbigua
    | e '*' e   # MultAmbigua
    | NUM       # NumAmbigua
    ;

NUM : [0-9]+ ('.' [0-9]+)? ;
WS  : [ \t\r\n]+ -> skip ;
