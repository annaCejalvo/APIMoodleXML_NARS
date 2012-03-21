package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;

public class MultiChoice extends Question{
	private boolean single;
	private boolean shuffleanswers;
	private String answernumbering;
	
	public MultiChoice(String nomQ, String textQ, boolean single, boolean shuffleanswers, String answernumbering) {
		super(nomQ, textQ);
		this.typeQ = "multichoice";
		this.single = single;
		this.shuffleanswers = shuffleanswers;
		
		//checked the form of String
		this.answernumbering = answernumbering;
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);
	}
	
	public void addContents(Element parent){
//		Element singleElement = new Element("single", new Boolean(single).toString());
//		super.getQuestionElement().addContent(singleElement);
//		Element shuffleElement = new Element("shuffleanswers", ""+shuffleanswers);
//		super.getQuestionElement().addContent(shuffleElement);
//		Element numberingElement = new Element("answernumbering", answernumbering);
//		super.getQuestionElement().addContent(numberingElement);
	}
	
	public static void main(String[] args) {
		MultiChoice tfQ = new MultiChoice("Q 1", "C vrai?", true, false, "ABC");
		//Element quiz = new Element("quiz");
		//org.jdom.Document doc = new Document(quiz);
		
		//tfQ.addAnwser(new Reponse(tfQ, "false", "Ooops!", 0));
		//doc.addContent(quiz);
		Quiz.quiz.addContent(tfQ.getQuestionElement());
		//quiz.addContent(tfQ.getQuestionElement());
		Quiz.affiche(Quiz.document);
	}

}
