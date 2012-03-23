package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Numerical extends Question  {
<<<<<<< HEAD

=======
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
	/**
	 * constructeur d'un numerical question
	 * @param nomQ : intitule de question
	 * @param  textQ : text de question
<<<<<<< HEAD
	 */
	public Numerical(String nomQ, String textQ) {
=======
	 */
	
	 public Numerical(String nomQ, String textQ) {
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
			super(nomQ, textQ);
			this.typeQ = "numerical";
			
			Attribute questionAttribute = new Attribute("type", this.typeQ);
			question.setAttribute(questionAttribute);
		}
<<<<<<< HEAD

=======
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
	 /**
		 * constructeur d'un multichoice heritant de la super classe
		 * @
		 */
	public Numerical(Element current) {
		super(current);
	}

}