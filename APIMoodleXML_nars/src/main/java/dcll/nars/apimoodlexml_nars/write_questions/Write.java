package dcll.nars.apimoodlexml_nars.write_questions;

import java.io.FileOutputStream;

import org.jdom.Document;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Write {
	
	/**
	 * Nous allons commencer notre arborescence en créant la racine XML qui sera ici "quiz"
	 * @attribute quiz : creation d'un quiz
	 * @attribute document : creation d'un document JDOM basé sur la racine que l'on vient de créer
	 */
	static Quiz quiz = new Quiz();

	static org.jdom.Document document = new Document(quiz.getQuizElement());
	
	/**
	 * methode principale qui enregistre un quiz sous format xml
	 * @param args : arguments de l'application
	 * 
	 */

	public static void main(String[] args) {
		TrueFalseQuestion question1 = new TrueFalseQuestion("Q 1", "C vrai?");
		question1.addAnswer(new Reponse("true", "correct!", 100));
		question1.addAnswer(new Reponse("false", "Ooops!", 0));

		ShortAnswer question2 = new ShortAnswer("Q 2", "question short");
		question2.addAnswer(new Reponse("The correct answer", "correct!", 100));
		
		Numerical question3 = new Numerical("Q 3", "question numerical");
		question3.addAnswer(new Reponse("23", "Feedback", 100));
				
		quiz.addQuestion(question1);
		quiz.addQuestion(question2);
		quiz.addQuestion(question3);
		
		Write f = new Write();
		
		f.affiche(document);
		f.enregistre(document, "quiz.xml");
	}
	
	/**
	 * Cette methode renregiqtre le quiz.xml dans la racine du projet
	 */

	public void affiche(org.jdom.Document document) {

		try {
			// On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		} 
		catch (java.io.IOException e) {
		}
	}


	/**
	 * Cette methode affiche le quiz.xml dans la console
	 */
	public void enregistre(org.jdom.Document document, String fichier) {

		try {
			// On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			// Remarquez qu'il suffit simplement de créer une instance de
			// FileOutputStream
			// avec en argument le nom du fichier pour effectuer la
			// sérialisation.
			sortie.output(document, new FileOutputStream(fichier));
		} 
		catch (java.io.IOException e) {
		}
	}

	

	}

