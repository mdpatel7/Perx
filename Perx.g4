/**
 * Define a grammar called Hello
 */

grammar Perx;

//r  : 'hello' ID ;         // match keyword hello followed by an identifier

//ID : [a-z]+ ;             // match lower-case identifiers


program: stmt_block
       ;

stmt_block: stmt';'stmt_block
          | stmt';'
          ;

stmt: decl_stmt
    | assign_stmt
    | ifelse_stmt
    | whileloop_stmt
    | print_stmt
    ;

decl_stmt: integer Identifier
         | bool Identifier
         ;

bool: 'boolean';

assign_stmt: Identifier ASSIGN expression
           ;


ifelse_stmt: 'if''('boolean_expression')''{'stmt_block'}'
           | 'if''('boolean_expression')''{'stmt_block'}' elsea '{'stmt_block'}'
           ;

boolean_expression: expression EQUALTO expression
                  | expression NOTEQUAL expression
                  | expression GREATEREQUAL expression
                  | expression LESSEQUAL expression
                  | expression GREATER expression
                  | expression LESS expression
                  | boolean_value
                  ;

boolean_value: 'T'
             | 'F'
             ;

whileloop_stmt: 'while''('boolean_expression')''do''{'stmt_block'}'
              ;

print_stmt: 'print' expression
          ;

Identifier: [a-z]+
          ;

COMMA:',';

expression: expression DIV expression
          | expression MUL expression
          | expression MOD expression
          | expression ADD expression
          | expression SUB expression
          | '('expression')'
          | Identifier
          | Number
          ;


Number: [0-9]+
      ;

integer: 'integer'
   ;


DIV:'/';

MUL:'*';

MOD:'%';

ADD:'+';

SUB:'-';

EQUALTO:'==';

NOTEQUAL:'!=';

GREATEREQUAL:'>=';

LESSEQUAL:'<=';

GREATER:'>';

LESS:'<';

ASSIGN:'=';

elsea: 'else';

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


