package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;

public class Numerical extends Question  {

	
	 public Numerical(String nomQ, String textQ) {
			super(nomQ, textQ);
			this.typeQ = "numerical";
			
			Attribute questionAttribute = new Attribute("type", this.typeQ);
			question.setAttribute(questionAttribute);
		}

}