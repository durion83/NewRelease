robocopy "%1" "%2" /mir /r:0 /log:%3
if %ERRORLEVEL% EQU 16 echo ***FATAL ERROR*** & goto end
    if %ERRORLEVEL% EQU 15 echo Code 15: OKCOPY + FAIL + MISMATCHES + XTRA & goto end
    if %ERRORLEVEL% EQU 14 echo Code 14: FAIL + MISMATCHES + XTRA & goto end
    if %ERRORLEVEL% EQU 13 echo Code 13: OKCOPY + FAIL + MISMATCHES & goto end
    if %ERRORLEVEL% EQU 12 echo Code 12: FAIL + MISMATCHES& goto end
    if %ERRORLEVEL% EQU 11 echo Code 11: OKCOPY + FAIL + XTRA & goto end
    if %ERRORLEVEL% EQU 10 echo Code 10: FAIL + XTRA & goto end
    if %ERRORLEVEL% EQU 9 echo Code 9: OKCOPY + FAIL & goto end
    if %ERRORLEVEL% EQU 8 echo Code 8: The process cannot access the file because it is being used by another process. & goto end
    if %ERRORLEVEL% EQU 7 echo Code 7: OKCOPY + MISMATCHES + XTRA & goto end
    if %ERRORLEVEL% EQU 6 echo Code 6: MISMATCHES + XTRA & goto end
    if %ERRORLEVEL% EQU 5 echo Code 5: OKCOPY + MISMATCHES & goto end
    if %ERRORLEVEL% EQU 4 echo Code 4: MISMATCHES & goto end
    if %ERRORLEVEL% EQU 3 echo Code 3: OKCOPY + XTRA & goto end
    if %ERRORLEVEL% EQU 2 echo Code 2: XTRA & goto end
    if %ERRORLEVEL% EQU 1 echo Code 1: Files Copied Successfully & goto end
    if %ERRORLEVEL% EQU 0 echo Code 0: Files are up to Date & goto end
    :end  