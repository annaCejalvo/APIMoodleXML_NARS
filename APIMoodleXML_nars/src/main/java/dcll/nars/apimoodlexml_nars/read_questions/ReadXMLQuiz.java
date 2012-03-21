package dcll.nars.apimoodlexml_nars.read_questions;

import java.io.*;
import org.jdom.*;
import org.jdom.input.*;

import dcll.nars.apimoodlexml_nars.write_questions.Quiz;

import java.util.List;
import java.util.Iterator;

public class ReadXMLQuiz {
	private Document doc;
	private Element racine;

	public void parser(String fileIn){

		//On crée une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		try
		{
			//On crée un nouveau document JDOM avec en argument le fichier XML
			//Le parsing est terminé ;)
			System.out.println(fileIn);
			doc = sxb.build(new File(fileIn));
		}
		catch(Exception e){}

		//On initialise un nouvel élément racine avec l'élément racine du document.
		racine = doc.getRootElement();
		
		if(doc.getRootElement().getName().equals(Quiz.getQuiz().getName()))
			createQuiz(doc.getRootElement());
		else
			System.out.println("Ce fichier n'est pas un quizz XML : impossible de le convertir en Objets Java");		
	}

	private void createQuiz(Element elem) {
		Quiz quiz = new Quiz(elem);
	}

	//Ajouter cette méthodes à la classe JDOM2
//	void afficheALL()
//	{
//		//On crée une List contenant tous les noeuds "etudiant" de l'Element racine
//		List listEtudiants = racine.getChildren("question");
//
//		//On crée un Iterator sur notre liste
//		Iterator i = listEtudiants.iterator();
//		while(i.hasNext())
//		{
//			//On recrée l'Element courant à chaque tour de boucle afin de
//			//pouvoir utiliser les méthodes propres aux Element comme :
//			//selectionner un noeud fils, modifier du texte, etc...
//			Element courant = (Element)i.next();
//			//On affiche le nom de l'element courant
//			System.out.println(courant.getChildren().toString());
//		}
//	}


	public static void main(String[] args) {
		ReadXMLQuiz cxtj = new ReadXMLQuiz();
		
		String adrs = "exemple.xml";
		
		cxtj.parser(adrs);
	}
}