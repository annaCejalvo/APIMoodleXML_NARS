package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Numerical extends Question  {

	
	 public Numerical(String nomQ, String textQ) {
			super(nomQ, textQ);
			addAttributeType("numerical");
		}

	public Numerical(Element elem) {
		super(elem);
		addAttributeType(elem.getAttributeValue("type"));
	}
}