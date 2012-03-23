package dcll.nars.apimoodlexml_nars.write_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom.Attribute;
import org.jdom.Element;

public class Question {
	
	private List<Reponse> answers;
	private String nomQ;
	private String textQ;
	protected String typeQ;
	/**
	 * Nous allons commencer notre arborescence en cr�ant la racine XML
	 * qui sera ici "question"
	 */

	protected Element question;
	/**
	 * constructeur d'une question	
	 * @param nomQ : intitule de question
	 * @param  textQ : text de question
	 */
	
	public Question(String nomQ, String textQ) {
		question = new Element("question");	
		answers = new ArrayList<Reponse>();
		this.nomQ = nomQ;
		this.textQ = textQ;

		Element nom = new Element("nom");
		Element textNomQ = new Element("text");
		textNomQ.setText(nomQ);
		nom.addContent(textNomQ);
		question.addContent(nom);

		Element questiontext = new Element("questiontext");
		Attribute formatQ = new Attribute("format", "html");
		questiontext.setAttribute(formatQ);
		Element text = new Element("text");
		text.setText(textQ);
		questiontext.addContent(text);
		question.addContent(questiontext);
	}

	public Question(Element elem) {
		this(elem.getChild("name").getChildText("text"), 
				elem.getChild("questiontext").getChildText("text"));
		List<Element> tmpLst = elem.getChildren("answer");
		
		Iterator i = tmpLst.iterator();
		int z=0;
		while(i.hasNext())
		{
			System.out.println("R"+z);
			z++;
			
			Element current = (Element)i.next();
			Reponse rep = new Reponse(current);
			answers.add(rep);
		}
		
	}

	public void addAnswer(Reponse e) {
		answers.add(e);
		question.addContent(e.getReponseElement());
	}

	public void modifyAnwser(Reponse ancienne, Reponse nouvelle) {
		int index = answers.indexOf(ancienne);
		answers.remove(index);
		answers.add(index, nouvelle);
	}
	
	public void deleteAnwser(Reponse e) {
		answers.remove(e);
	}
	
	public Element getQuestionElement() {
		return question;
	}

	public List<Reponse> getAnswers() {
		return answers;
	}

	public String getNomQ() {
		return nomQ;
	}

	public String getTextQ() {
		return textQ;
	}

	public String getTypeQ() {
		return typeQ;
	}

	public Element getQuestion() {
		return question;
	}
	
	
}