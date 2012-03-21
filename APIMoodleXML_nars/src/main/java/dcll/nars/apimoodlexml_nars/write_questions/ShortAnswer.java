package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class ShortAnswer extends Question{
	
	public ShortAnswer(String nom, String texte) {
		super(nom, texte);
		this.typeQ = "shortanswer";
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);
	}
}
