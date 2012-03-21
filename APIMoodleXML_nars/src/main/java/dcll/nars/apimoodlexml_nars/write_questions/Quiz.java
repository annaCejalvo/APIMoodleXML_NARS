package dcll.nars.apimoodlexml_nars.write_questions;

import java.io.FileOutputStream;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Quiz {
	private List<Question> questions;
	// Nous allons commencer notre arborescence en cr�ant la racine XML
	// qui sera ici "quiz"
	static Element quiz = new Element("quiz");
	// On cr�e un nouveau Document JDOM bas� sur la racine question que l'on
	// vient de cr�er
	static org.jdom.Document document = new Document(quiz);

	public static void main(String[] args) {


		TrueFalseQuestion tfQ = new TrueFalseQuestion("Q 1", "C vrai?");
		tfQ.addAnswer(new Reponse("true", "correct!", 100));
		tfQ.addAnswer(new Reponse("false", "Ooops!", 0));

		ShortAnswer q2  = new ShortAnswer("Q 2", "question short");
		q2.addAnswer(new Reponse("The correct answer", "correct!", 100));
		
		Numerical num =new Numerical("Q 3", "question numerical");
		num.addAnswer(new Reponse("23", "Feedback", 100));
				

		quiz.addContent(tfQ.getQuestionElement());
		quiz.addContent(q2.getQuestionElement());
		quiz.addContent(num.getQuestionElement());
		
		affiche(document);
		enregistre(document, "quiz.xml");
	}

	/* Ces deux methodes servent a ecrire le quiz.xml */
	static void affiche(org.jdom.Document document) {
		try {
			// On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		} catch (java.io.IOException e) {
		}
	}

	static void enregistre(org.jdom.Document document, String fichier) {
		try {
			// On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			// Remarquez qu'il suffit simplement de créer une instance de
			// FileOutputStream
			// avec en argument le nom du fichier pour effectuer la
			// sérialisation.
			sortie.output(document, new FileOutputStream(fichier));
		} catch (java.io.IOException e) {
		}
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Question> getQuestions() {
		return questions;
	}
}
