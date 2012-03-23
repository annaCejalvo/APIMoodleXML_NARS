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
		addAttributeType("shortanswer");
	}

	public ShortAnswer(Element elem) {
		super(elem);
		addAttributeType(elem.getAttributeValue("type"));
	}
}

