package dcll.nars.apimoodlexml_nars.read_questions;

import java.io.*;
import org.jdom.*;
import org.jdom.input.*;
import java.util.List;
import java.util.Iterator;

public class ReadXMLQuiz {
	static Document document;
	static Element racine;

	public static void main(String[] args) {
		// On cr�e une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		try {
			// On cr�e un nouveau document JDOM avec en argument le fichier XML
			// Le parsing est termin� ;)
			document = sxb.build(new File("quiz.xml"));
		} catch (Exception e) {
			System.err.println(" pb de parsing : " + e ) ; 

		}

		// On initialise un nouvel �l�ment racine avec l'�l�ment racine du
		// document.
		racine = document.getRootElement();
		// M�thode d�finie juste apres
		afficheALL();
	}

	static void afficheALL() {
		// On cr�e une List contenant tous les noeuds "question" de l'Element
		// racine
		List listQuestions = racine.getChildren("question");
		System.out.println("Root element of the doc is "+ racine.getName());
		System.out.println("Total of questions "+ racine.getChildren().size());
		// On cr�e un Iterator sur notre liste
		Iterator i = listQuestions.iterator();
		while (i.hasNext()) {
			// On recr�e l'Element courant � chaque tour de boucle afin de
			// pouvoir utiliser les m�thodes propres aux Element comme :
			// selectionner un noeud fils, modifier du texte, etc...
			Element question = (Element) i.next();
			System.out.println("\tquestion type=\""+question.getAttributeValue("type")+"\"");
			System.out.println("\t\tnom question : "+ question.getChild("nom").getChild("text").getText());
			System.out.println("\t\tquestion format=\""+ question.getChild("questiontext").getAttributeValue("format")+"\"");
			System.out.println("\t\t\ttext question : "+ question.getChild("questiontext").getChild("text").getText());
			// On affiche le nom de l'element courant
			List listReponses = question.getChildren("reponse");
			Iterator j = listReponses.iterator();
			while (j.hasNext()) {
				Element reponse = (Element) j.next();
				System.out.println("\t\treponse fraction=\""+reponse.getAttributeValue("fraction")+"\"");
				System.out.println("\t\t\ttext reponse : "+reponse.getChild("text").getText());
				System.out.println("\t\t\tfeedback reponse : "+reponse.getChild("feedback").getChild("text").getText());
			}
			//System.out.println(courant.getChild("questiontext").getText());
			//System.out.println(courant.getChild("reponse").getText());
		}
	}
}