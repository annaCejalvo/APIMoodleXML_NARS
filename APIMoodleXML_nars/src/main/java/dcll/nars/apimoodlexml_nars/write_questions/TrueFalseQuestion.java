package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class TrueFalseQuestion extends Question {

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