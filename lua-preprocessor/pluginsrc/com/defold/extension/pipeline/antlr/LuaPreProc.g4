grammar LuaPreProc ;
options {
	tokenVocab = LuaPreProcLexer;
}

codefile: (preproc | line)* EOF ;

preproc  : ifdef | elsedef | endif ;
param	 : PP_PARAM_RELEASE | PP_PARAM_DEBUG | PP_PARAM_HEADLESS ;
ifdef    : PP_IFDEF param PP_EOL ;
elsedef  : PP_ELSE  PP_EOL ;
endif    : PP_ENDIF PP_EOL? ;

line     : TEXT (PP_EOL | EOL | EOF?) ;
