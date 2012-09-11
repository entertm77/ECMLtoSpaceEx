package ecml;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ECMLStructTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
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

    /**
     * Tests cbm document that can be parsed by DOM editor.
     */
    @Test
    public final void parse_available_test() {
	DOMParser parser = new DOMParser();
	try {
	    parser.parse("sample/Quadrotor1.Rotor1.cbm");
	    Document dom = parser.getDocument();
	    walkNode(dom.getDocumentElement());

	} catch (SAXException | IOException e) {
	    e.printStackTrace();
	}
    }

    private static void walkNode(Node theNode) {
	NodeList children = theNode.getChildNodes();
	printNode(theNode);
	for (int i = 0; i < children.getLength(); i++) {
	    Node aNode = children.item(i);
	    if (aNode.hasChildNodes())
		walkNode(aNode);
	    else
		printNode(aNode);
	}
    }

    private static void printNode(Node aNode) {
	System.out.println(aNode.getNodeName() + "," + aNode.getNodeValue());
	
	NamedNodeMap map = aNode.getAttributes();
	if(map != null){
	for(int i=0;i<map.getLength();i++){
	    Node item = map.item(i);
	    System.out.println(item.getNodeName() +"," +item.getNodeValue());
	}
	
	}
    }

}
