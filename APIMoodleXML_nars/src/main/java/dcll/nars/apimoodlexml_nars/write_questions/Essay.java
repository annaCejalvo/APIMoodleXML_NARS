package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Essay extends Question {

	public Essay(String nomQ, String textQ) {
		super(nomQ, textQ);
		
		addAttributeType("essay");
	}
	
	public Essay(Element elem){
		super(elem);
		addAttributeType(elem.getAttributeValue("type"));
	}


}
