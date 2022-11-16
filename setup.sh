#!/bin/sh

if [ -z "$1" ]; then
  echo "Please, specify path to antlr-4.9.1-complete.jar"
  exit 1
fi
jar_path = "$1"
export CLASSPATH=".:${jar_path}:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "${jar_path}:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "${jar_path}:$CLASSPATH" org.antlr.v4.gui.TestRig'
echo $jar_path
