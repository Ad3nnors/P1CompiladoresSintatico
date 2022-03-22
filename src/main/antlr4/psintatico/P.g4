grammar P;

NUMERO: [0-9]+;
ID: [a-zA-Z]+;
OP: '<-' | '+' | '-' | '*' | '/';
WS: (' ' | '\t' | '\r' | '\n') -> skip;

programa: cmd+ EOF;
cmd: expr |
'read' ID |
'write' expr;
expr: termo (OP termo)*;
termo: NUMERO | ID | '(' expr ')';