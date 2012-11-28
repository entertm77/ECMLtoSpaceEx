package ecml;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import parsers.ECMLFormulaLexer;
import parsers.ECMLFormulaParser;


public class StateFormula extends CommonAttr {

	private ECMLFormulaParser.state_model_return state_model_ret;
	@Override
	public void setName(String name) throws RecognitionException {
		// TODO Auto-generated method stub
		super.setName(name);
		ANTLRStringStream stream = new ANTLRStringStream(name);
		ECMLFormulaLexer lexer = new ECMLFormulaLexer(stream);
		CommonTokenStream ctstream = new CommonTokenStream(lexer);
		ECMLFormulaParser formula = new ECMLFormulaParser(ctstream);
		state_model_ret = formula.state_model();
	}
	public ECMLFormulaParser.state_model_return get_formula_return (){
		return state_model_ret;
	}
	
   
}
