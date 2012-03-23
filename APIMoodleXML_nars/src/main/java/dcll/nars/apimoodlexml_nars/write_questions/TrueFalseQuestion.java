package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.*;

<<<<<<< HEAD
public class TrueFalseQuestion extends Question {
=======
public class TrueFalseQuestion extends Question {
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
	/**
	 * constructeur d'un truefalse question
	 * @param nomQ : intitule de truefalse question
	 * @param  textQ : texte la question truefalse
<<<<<<< HEAD
	 */
=======
	 */
	
>>>>>>> 37817f25978170f9038ffc005080f2dbd8ebd547
	public TrueFalseQuestion(String nomQ, String textQ) {
		
		super(nomQ, textQ);
		this.typeQ = "truefalse";
		
		Attribute questionAttribute = new Attribute("type", this.typeQ);
		question.setAttribute(questionAttribute);
	}

	public TrueFalseQuestion(Element current) {
		super(current);
	}

}