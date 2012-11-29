package parsers;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

import sspaceex.SXSspaceex;

import ecml.CBMReader;
import ecml.BehavioralModel;
import ecml.IllegalGrammarException;

public class ParserTest {
	static {

	}
	private static Logger log = Logger.getLogger(ParserTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PropertyConfigurator.configure(ParserTest.class
				.getResource("log4j.config"));

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IllegalGrammarException, SAXException,
			IOException {
		String test_expression = "abc[T4+3 == 23]//";
		ANTLRStringStream anss = new ANTLRStringStream(test_expression);
		ECMLFormulaLexer lexer = new ECMLFormulaLexer(anss);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		ECMLFormulaParser parser = new ECMLFormulaParser(tokenStream);		
		try {
			ECMLFormulaParser.connection_contents_return def_return = parser.connection_contents();
			
			log.debug("Tree Status : " + ((Tree)def_return.getTree()).toStringTree());
			
			for(Tree cond_tree:def_return.conditions){
				log.debug("Condition Tree Status : " + cond_tree.toStringTree());
				
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(cond_tree);
				
				SxExpression transition = new SxExpression(nodes);
				SxExpression.cond_exp_return cond_express = transition.cond_exp();
				
				log.debug(cond_express.st.toString());
				log.debug("Invariant for node stream");
				
				nodes = new CommonTreeNodeStream(cond_tree);
				
				SxNegTree variant = new SxNegTree(nodes);
				SxNegTree.and_exp_return and_exp = variant.and_exp();
				
				assertNotNull(and_exp.tree);
				assertNotNull(and_exp.tree.token);
			}
		} catch (RecognitionException e) {
			log.error(e);
		}
	}

}
