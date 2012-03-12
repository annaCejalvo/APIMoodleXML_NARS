package dcll.nars.apimoodlexml_nars;

import java.io.FileOutputStream;
import java.util.List;

import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Question {
	private List<String> reponses;
	private String intitule;
	
	/*public Question(String intitule){
		this.intitule = intitule;
		//this.reponses = new List();
	}*/
	
	static void affiche(org.jdom.Document document){
		try{
		//On utilise ici un affichage classique avec getPrettyFormat()
		XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
		sortie.output(document, System.out);
		}
		catch (java.io.IOException e){}
	}

	static void enregistre(org.jdom.Document document, String fichier){
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
