package dcll.nars.apimoodlexml_nars;

import java.io.*;
import org.jdom.*;
import org.jdom.output.*;

public class ShortAnswer extends Question{

	static Element question = new Element("question");
	
	static org.jdom.Document document = new Document(question);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Attribute questionA = new Attribute("type", "shortanswer");
		question.setAttribute(questionA);
		
		Element answer = new Element("answer");
		Attribute answerA = new Attribute ("fraction", "100");
		answer.setAttribute(answerA);
		question.addContent(answer);
		
		Element text = new Element("text");
		text.setText("The correct answer");
		answer.addContent(text);
		Element feedback = new Element("feedback");
		answer.addContent(feedback);
		Element textFeedBack = new Element("text");
		textFeedBack.setText("Correct!");
		feedback.addContent(textFeedBack);
		
		affiche(document);
		enregistre(document, "ShortAnswer.xml");
	}
}
