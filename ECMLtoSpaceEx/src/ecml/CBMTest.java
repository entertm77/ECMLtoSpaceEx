package ecml;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CBMTest {
	static private CPSBehavioralModel cbm;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		File file = new File("sample/Quadrotor1.Rotor2.cbm.xml");
		System.out.println(file.exists());
		CBMReader reader = new CBMReader();

		setCbm(reader.parse("sample/Quadrotor1.Rotor2.cbm.xml"));

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
	public void cbmReaderTest() throws IllegalGrammarException {
		System.out.println(cbm.toString());
	}

	public static CPSBehavioralModel getCbm() {
		return cbm;
	}

	public static void setCbm(CPSBehavioralModel cbm) {
		CBMTest.cbm = cbm;
	}

}
