java -jar antlr-3.4-complete-no-antlrv2.jar -trace -print -o ../src/parsers ECMLFormula.g >result.log
java -jar antlr-3.4-complete-no-antlrv2.jar -trace -print -o ../src/parsers SpaceExTransition.g >> result.log
java -jar antlr-3.4-complete-no-antlrv2.jar -trace -print -o ../src/parsers SpaceExInvariant.g

