package dcll.nars.apimoodlexml_nars;

import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Content;
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

		WriteTrueFalseQuestion tfQ = new WriteTrueFalseQuestion("Q 1",
				"C vrai?", "truefalse");
		Reponse r = new Reponse(tfQ, "true", "correct!", 100);
		tfQ.addAnwser(r);
		
//		
//		List content = r.getReponse().getParent().cloneContent();
//		// detach: --> same exception with or without this
//		for (int i = 0; i <content.size(); i++) {
//			Content next = (Content) content.get(i);
//			next.detach();
//		}
//		// create 2nd document with root element
//		Document doc2 = new Document();
//		doc2.setRootElement(new Element("question"));
//		r.getReponse().getParent().getRootElement().setContent(content);	
		
		//tfQ.addAnwser(new Reponse(tfQ, "false", "Ooops!", 0));

		quiz.addContent(tfQ.getQuestionElement());

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

}