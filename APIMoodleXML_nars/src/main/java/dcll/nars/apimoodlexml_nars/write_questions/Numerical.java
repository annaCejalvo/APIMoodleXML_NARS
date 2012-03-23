package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Numerical extends Question {

	/**
	 * constructeur d'un numerical question
	 * 
	 * @param nomQ
	 *            : intitule de question
	 * @param textQ
	 *            : text de question
	 */
	public Numerical(String nomQ, String textQ) {
		super(nomQ, textQ);
		addAttributeType("numerical");
	}

	/**
	 * constructeur d'un multichoice heritant de la super classe @
	 */
	public Numerical(Element elem) {
		super(elem);
		addAttributeType(elem.getAttributeValue("type"));
	}

}