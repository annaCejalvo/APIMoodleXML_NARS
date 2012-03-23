package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;

public class MultiChoice extends Question{
	private boolean single;
	private boolean shuffleanswers;
	private String answernumbering;
	
	/**
	 * constructeur d'un multichoice question
	 * @param nomQ : intitule de question
	 * @param  textQ : text de question
	 * @param single : boolean
	 * @param shuffleanswers
	 * @param answernumbering
	 * 
	 */
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
	/**
	 * constructeur d'un multichoice question
	 * @param elem : element du question
	
	 */
	public MultiChoice(Element elem) {
		super(elem);
		
		single = Boolean.parseBoolean(elem.getChildText("single"));
		shuffleanswers = Boolean.parseBoolean(elem.getChildText("shuffleanswers"));
		answernumbering = elem.getChildText("answernumbering");
		
		Element single = new Element("single");
		single.setText(elem.getChildText("single"));
		Element shuffleanswers = new Element("shuffleanswers");
		shuffleanswers.setText(elem.getChildText("shuffleanswers"));
		Element answernumbering = new Element("answernumbering");
		answernumbering.setText(elem.getChildText("answernumbering"));
		
		question.addContent(single);
		question.addContent(shuffleanswers);
		question.addContent(answernumbering);
	}

	public void addContents(Element parent){
//		Element singleElement = new Element("single", new Boolean(single).toString());
//		super.getQuestionElement().addContent(singleElement);
//		Element shuffleElement = new Element("shuffleanswers", ""+shuffleanswers);
//		super.getQuestionElement().addContent(shuffleElement);
//		Element numberingElement = new Element("answernumbering", answernumbering);
//		super.getQuestionElement().addContent(numberingElement);
	}
	
//	public static void main(String[] args) {
//		MultiChoice tfQ = new MultiChoice("Q 1", "C vrai?", true, false, "ABC");
		//Element quiz = new Element("quiz");
		//org.jdom.Document doc = new Document(quiz);
		
		//tfQ.addAnwser(new Reponse(tfQ, "false", "Ooops!", 0));
		//doc.addContent(quiz);
		//Quiz.quiz.addContent(tfQ.getQuestionElement());
		//quiz.addContent(tfQ.getQuestionElement());
		//Quiz.affiche(Quiz.document);
	//}

}
