package dcll.nars.apimoodlexml_nars;

import java.io.*;
import org.jdom.*;
import org.jdom.output.*;

public class ShortAnswer /*extends Question*/{

	static Element racine = new Element("question");
	
	static org.jdom.Document document = new Document(racine);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Attribute questionA = new Attribute("type", "shortanswer");
		
		Element answer = new Element("answer");
		racine.addContent(answer);
		
		Element text = new Element("text");
		text.setText("The correct answer");
		answer.addContent(text);
		Element feedback = new Element("feedback");
		answer.addContent(feedback);
		Element textFeedBack = new Element("text");
		textFeedBack.setText("Correct");
		feedback.addContent(textFeedBack);
		
		affiche();
		enregistre("ShortAnswer.xml");
	}

	static void affiche(){
		try{
		//On utilise ici un affichage classique avec getPrettyFormat()
		XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		sortie.output(document, System.out);
		}
		catch (java.io.IOException e){}
	}

	static void enregistre(String fichier){
		try{
		//On utilise ici un affichage classique avec getPrettyFormat()
		XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		//Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
		//avec en argument le nom du fichier pour effectuer la sérialisation.
		sortie.output(document, new FileOutputStream(fichier));
		}
		catch (java.io.IOException e){}
	}
}
