package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

public class ShortAnswer extends Question{
<<<<<<< HEAD

=======
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
	/**
	 * constructeur d'une shortanswer question
	 * @param nom : intitule de shortanswer question
	 * @param  texte : de shortanswer question
	 */
<<<<<<< HEAD
=======
	
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
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
