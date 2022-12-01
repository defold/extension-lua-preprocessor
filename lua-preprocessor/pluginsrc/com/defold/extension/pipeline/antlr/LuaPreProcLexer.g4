lexer grammar LuaPreProcLexer ;

EMPTY_LINE : '\r'? '\n' -> skip ;
MODE_PP : PP_WS? '--#' -> channel(HIDDEN), pushMode(PreProc) ;
MODE_LINE : [\r\n]* -> channel(HIDDEN),pushMode(LineMode) ;

mode PreProc ;

PP_IFDEF 			: 'IF' ;
PP_ELSE  			: 'ELSE'  ;
PP_ENDIF 			: 'ENDIF' ;

PP_PARAM_RELEASE	: 'RELEASE' ;
PP_PARAM_DEBUG		: 'DEBUG' ;
PP_PARAM_HEADLESS	: 'HEADLESS' ;

PP_TEXT  			: [a-zA-Z0-9_-]+ ;
PP_EOL   			: '\r'? '\n'    -> popMode ;
PP_WS    			: [ \t]+        -> channel(HIDDEN) ;

mode LineMode ;

TEXT     : ~[\r\n]+ ;
EOL      : '\r'? '\n'    -> popMode ;
