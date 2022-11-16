# Notes for the extension development

This extension uses [ANTLR](https://www.antlr.org).

All `*.java` files in `lua-preprocessor/pluginsrc/com/dynamo/bob/pipeline/antlr` are generated from the gramma files `*.g4` in the same folder using ANTLR.

0. Make sure you have Java installed
1. Download [https://www.antlr.org/download/antlr-4.9.3-complete.jar](https://www.antlr.org/download/antlr-4.9.3-complete.jar)
2. Run:

```
jar_path="PATH_TO_antlr-4.9.3-complete.jar"

export CLASSPATH="".:${jar_path}:$CLASSPATH""
alias antlr4='java -Xmx500M -cp "${jar_path}:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "${jar_path}:$CLASSPATH" org.antlr.v4.gui.TestRig'
```

3. For `*.java` classes generation use:

```
antlr4 LuaPreProc*.g4  -package com.dynamo.bob.pipeline.antlr
```

4. For testing grammar use:

```
antlr4 LuaPreProc*.g4 &&  javac  LuaPre*.java && grun LuaPreProc codefile -tree
```
-Enter
-Cmd+D

Have fun! )