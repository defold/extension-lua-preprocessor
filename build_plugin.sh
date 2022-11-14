#!/usr/bin/env bash

java -jar bob.jar --debug --platform=x86_64-macos --verbose --build-artifacts=plugins clean build

cp build/x86_64-osx/lua-preprocessor/pluginLuaPreprocessor.jar lua-preprocessor/plugins/share