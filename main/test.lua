local M = {
}

function M.greet(name)
--#IF RELEASE 
	print("Hello " .. name)
--#ELSE
	print("More debug info:"..name)
--#ENDIF

end

return M