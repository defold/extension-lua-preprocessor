# extension-lua-preprocessor
A small and simple Lua preprocessor. This extension hooks into the [Lua builder plugin system in bob](https://github.com/defold/defold/blob/e5532bf6253af38d2960910ca6230750036f0195/com.dynamo.cr/com.dynamo.cr.bob/src/com/dynamo/bob/pipeline/LuaBuilder.java#L85).

## Installation
To use this library in your Defold project, add the following URL to your `game.project` dependencies:

## Example

```lua
--#IF DEBUG
local lives_num = 999
--#ELSE 
local lives_num = 3
--#ENDIF
```
