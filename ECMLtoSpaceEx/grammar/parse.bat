set p1=ECMLFormula
set p2=SxExpression
set p3=SxNegTree
set dest=..\src\parsers\

java -jar antlr-3.4-complete-no-antlrv2.jar -print -o . %p1%.g >result.log
java -jar antlr-3.4-complete-no-antlrv2.jar -print -o . %p2%.g >> result.log
java -jar antlr-3.4-complete-no-antlrv2.jar -print -o . %p3%.g >> result.log

for %%i in (%p2%,%p3%)do copy %%i.java %dest%%%i.java

for %%i in (%p1%,%p2%,%p3%) do copy %%i.tokens %dest%%%i.tokens

for %%i in (%p2%,%p3%%) do del %%i.java 


copy %p1%Lexer.java %dest%%p1%Lexer.java
copy %p1%Parser.java %dest%%p1%Parser.java

del %p1%Lexer.java
del %p1%Parser.java
