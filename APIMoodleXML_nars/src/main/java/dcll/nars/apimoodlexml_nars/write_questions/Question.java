package dcll.nars.apimoodlexml_nars.write_questions;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;

public class Question {
	
	public List<Reponse> answers;
	public String nomQ;
	public String textQ;
	public String typeQ;
	// Nous allons commencer notre arborescence en cr�ant la racine XML
	// qui sera ici "question"
	public Element question;

	public Question(String nomQ, String textQ, String type) {
		question = new Element("question");	
		answers = new ArrayList<Reponse>();
		this.nomQ = nomQ;
		this.textQ = textQ;
		this.typeQ = type;
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);

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

}
