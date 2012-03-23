package dcll.nars.apimoodlexml_nars.read_questions;

import java.io.*;

import org.jdom.*;
import org.jdom.input.*;

import dcll.nars.apimoodlexml_nars.write_questions.Quiz;
import dcll.nars.apimoodlexml_nars.write_questions.Write;


public class ReadXMLQuiz {
	/**
	 * Nous allons commencer notre par creer
	 * @attribute doc : document xml
	 * @attribute racine : element racine du xml
	 */
	private Document doc;
	private Element racine;
	/**
	 * methode parseur xml java
	 */
	public Quiz parser(String fileIn){

		Quiz quiz = null;
		
		//On crée une instance de SAXBuilder
		SAXBuilder sxb = new SAXBuilder();
		try
		{
			//On crée un nouveau document JDOM avec en argument le fichier XML
			//Le parsing est terminé ;)
			System.out.println(fileIn);
			//URI uri = new URI(fileIn);
			doc = sxb.build(new File(fileIn));
		}
		catch(Exception e){
			System.out.println("Impossible de trouver le fichier");
		}

		//On initialise un nouvel élément racine avec l'élément racine du document.
		racine = doc.getRootElement();
		
		if(racine.getName().equals(Quiz.getBalisequiz())){
			quiz = new Quiz(racine);
			//createQuiz(doc.getRootElement());
		}else{
			System.out.println("Ce fichier n'est pas un quizz XML : impossible de le convertir en Objets Java");		
		}
		
		return quiz;
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

	/**
	 * methode principale qui fait generer des objets java a partir
	 * d'un fichier xml
	 */
	public static void main(String[] args) {
		ReadXMLQuiz cxtj = new ReadXMLQuiz();
		
		String adrs = "exemple.xml";
		
		Quiz q = cxtj.parser(adrs);
		
		if (q != null) {
			Write w = new Write();
			Document doc = new Document();
			System.out.println(q.getQuizElement().getChildren().toString());
			doc.setRootElement(q.getQuizElement());
			w.affiche(doc);
			w.enregistre(doc, "Testxdfgf");
		}
	}
}