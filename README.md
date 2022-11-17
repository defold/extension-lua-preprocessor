# extension-lua-preprocessor
A small and simple Lua preprocessor for Defold. This extension hooks into the [Lua builder plugin system in bob](https://github.com/defold/defold/blob/cb60610ba7c4683267a2abd509340507105ef3bb/com.dynamo.cr/com.dynamo.cr.bob/src/com/dynamo/bob/pipeline/LuaBuilder.java#L94).

## Installation
To use this library in your Defold project, add the needed version URL to your `game.project` dependencies from [Releases](https://github.com/defold/extension-lua-preprocessor/releases)

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
---
If you have any issues, questions or suggestions please [create an issue](https://github.com/defold/extension-lua-preprocessor/issues)
