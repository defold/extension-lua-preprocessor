# extension-lua-preprocessor
A small and simple Lua preprocessor. This extension hooks into the [Lua builder plugin system in bob](https://github.com/defold/defold/blob/e5532bf6253af38d2960910ca6230750036f0195/com.dynamo.cr/com.dynamo.cr.bob/src/com/dynamo/bob/pipeline/LuaBuilder.java#L85).

## Installation
To use this library in your Defold project, add the needed version URL to your `game.project` dependencies from (Releases)[https://github.com/defold/extension-lua-preprocessor/releases]

<img width="401" alt="image" src="https://user-images.githubusercontent.com/2209596/202223571-c77f0304-5202-4314-869d-7a90bbeec5ec.png">

## Example

```lua
-- Use one of the following keywords: RELEASE, DEBUG or HEADLESS
--#IF DEBUG
local lives_num = 999
--#ELSE 
local lives_num = 3
--#ENDIF
```
