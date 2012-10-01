package spaceex;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
import ecml.CPSBehavioralModel;
import ecml.IllegalGrammarException;

public class TranslatorTest {
    static {
	
	

    }
    private static Logger logger = Logger.getLogger(TranslatorTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
	PropertyConfigurator.configure(TranslatorTest.class.getResource("log4j.config"));
	
	
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
    public final void test() throws IllegalGrammarException, SAXException,
	    IOException {

	CBMReader reader = new CBMReader();
	reader.parse("C:/Users/Jaeyeon/git/ECMLtoSpaceEX/ECMLtoSpaceEx/sample/Quadrotor1.Rotor2.cbm.xml");
	CPSBehavioralModel cbm = reader.getCPSBehavioalModel();
	Translator translator = new Translator();
	SXSspaceex ex = translator.translation(cbm);

	logger.debug(ex.getXml());
    }

}
