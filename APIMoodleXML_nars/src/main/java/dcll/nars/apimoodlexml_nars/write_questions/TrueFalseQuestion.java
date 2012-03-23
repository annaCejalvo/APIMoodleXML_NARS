package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class TrueFalseQuestion extends Question {

	/**
	 * constructeur d'un truefalse question
	 * @param nomQ : intitule de truefalse question
	 * @param  textQ : texte la question truefalse
	 */
	public TrueFalseQuestion(String nomQ, String textQ) {
		
		super(nomQ, textQ);
		this.typeQ = "truefalse";
		
		addAttributeType("truefalse");
	}

	public TrueFalseQuestion(Element elem) {
		super(elem);
		addAttributeType(elem.getAttributeValue("type"));
	}

}