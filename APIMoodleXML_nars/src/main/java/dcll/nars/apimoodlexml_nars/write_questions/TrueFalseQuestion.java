package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class TrueFalseQuestion extends Question {

	public TrueFalseQuestion(String nomQ, String textQ) {
		
		super(nomQ, textQ);
		this.typeQ = "truefalse";
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);
	}

	public TrueFalseQuestion(Element current) {
		super(current);
	}
}