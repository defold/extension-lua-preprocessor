local M = {
}

function M.greet(name)
--#IF RELEASE 
	-- use io.stdout as that will still write to stdout in release mode
	io.stdout:write("Hello " .. name .. "\n")
--#ELSE
	print("More debug info: " .. name)
--#ENDIF

end

return M