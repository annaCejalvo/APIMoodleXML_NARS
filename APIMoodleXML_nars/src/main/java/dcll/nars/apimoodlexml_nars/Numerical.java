package dcll.nars.apimoodlexml_nars;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;

public class Numerical extends Question  {
	
     static Element question = new Element("question");
	
	static org.jdom.Document document = new Document(question);
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Attribute questionA = new Attribute("type", "Numerical ");
		question.setAttribute(questionA);
		
		Element answer = new Element("answer");
		Attribute answerA = new Attribute ("fraction", "100");
		answer.setAttribute(answerA);
		question.addContent(answer);
		Element text = new Element("text");
		text.setText("23");
		
		answer.addContent(text);
		
		Element feedback = new Element("feedback");
		answer.addContent(feedback);
		
		Element textFeedBack = new Element("text");
		textFeedBack.setText("Feedback");
		feedback.addContent(textFeedBack);
		
		affiche(document);
		enregistre(document, "Numerical.xml");
		
		
	}

}
