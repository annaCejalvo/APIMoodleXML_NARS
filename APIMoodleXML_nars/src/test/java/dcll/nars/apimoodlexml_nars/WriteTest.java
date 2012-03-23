package dcll.nars.apimoodlexml_nars;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import dcll.nars.apimoodlexml_nars.write_questions.Numerical;
import dcll.nars.apimoodlexml_nars.write_questions.Quiz;
import dcll.nars.apimoodlexml_nars.write_questions.Reponse;
import dcll.nars.apimoodlexml_nars.write_questions.Write;

public class WriteTest {

	Write w;
	Quiz quiz;
	Document document;

	@Before
	public void setUp() {
		w = new Write();
		quiz = new Quiz();
		document = new Document(quiz.getQuizElement());
	}

	@After
	public void tearDown() {
		w = null;
		quiz = null;
		document = null;
	}

	@Test
	public void testDenregistrementXML() throws FileNotFoundException,
			ParserConfigurationException {
		Numerical question3 = new Numerical("Q 3", "question numerical");
		question3.addAnswer(new Reponse("23", "Feedback", 100));

		quiz.addQuestion(question3);
		w.enregistre(document, "sortieDeTest.xml");
		File f = new File("sortieDeTest.xml");

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setCoalescing(true);
		dbf.setIgnoringElementContentWhitespace(true);
		dbf.setIgnoringComments(true);
		DocumentBuilder db = dbf.newDocumentBuilder();

		org.w3c.dom.Document doc1 = null, doc2 = null;

		try {
			doc1 = (org.w3c.dom.Document) db.parse(f);
			((org.w3c.dom.Document) doc1).normalizeDocument();

			doc2 = (org.w3c.dom.Document) db.parse(new File(
					"fichierDeVerif.xml"));
			((org.w3c.dom.Document) doc2).normalizeDocument();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(doc1.getNodeValue(), doc2.getNodeValue());
	}
	
	@Test
	public void testQuizContientQlqChose() {
		try {
			testDenregistrementXML();
			assertTrue(quiz.getQuestions().size()>0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
