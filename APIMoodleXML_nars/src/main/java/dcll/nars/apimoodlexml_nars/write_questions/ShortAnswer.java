package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class ShortAnswer extends Question{

	/**
	 * constructeur d'une shortanswer question
	 * @param nom : intitule de shortanswer question
	 * @param  texte : de shortanswer question
	 */
	public ShortAnswer(String nom, String texte) {
		super(nom, texte);
		this.typeQ = "shortanswer";
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);
	}


	public ShortAnswer(Element current) {
		super(current);
	}

}
