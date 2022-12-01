#!/usr/bin/env bash

rm -f lua-preprocessor/plugins/share/pluginLuaPreprocessor.jar

java -jar bob.jar --debug --platform=x86_64-macos --verbose --build-artifacts=plugins clean build

cp build/x86_64-osx/lua-preprocessor/pluginLuaPreprocessor.jar lua-preprocessor/plugins/share