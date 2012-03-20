package dcll.nars.apimoodlexml_nars;

import java.io.FileOutputStream;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Numerical extends Question  {
<<<<<<< HEAD
	
	
	static Element question = new Element("question");
	
	static org.jdom.Document document = new Document(question);
	
     public Numerical(String nomQ, String textQ, String type) {
		super(nomQ, textQ, type);
		// TODO Auto-generated constructor stub
		
	
		
	}


	//static Element question = new Element("question");
	
	//static org.jdom.Document document = new Document(question);
	

	/**
	 * @param args
	 */
     public void addContents(){
    	 
		//Attribute questionA = new Attribute("type", "Numerical ");
		//question.setAttribute(questionA);
    	 
		
		Element answer = new Element("answer");
		Attribute answerA = new Attribute ("fraction", "100");
		answer.setAttribute(answerA);
		question.addContent(answer);
		Element text = new Element("text");
		text.setText("23");
		
		answer.addContent(text);
		
		Element feedback = new Element("feedback");
		answer.addContent(feedback);
		
		Element textFeedBack = new Element("text");
		textFeedBack.setText("Feedback");
		feedback.addContent(textFeedBack);
		
	
		
     }		
		
		 public  void affich() {

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

			    sortie.output(document, new FileOutputStream(fichier));
			  }
			catch (java.io.IOException e){}
			   }

				//affich(document);
				//enregistre(document, "Numerical.xml");
				
		
		
	
=======

	public Numerical(String nomQ, String textQ, String type) {
		super(nomQ, textQ, type);
		// TODO Auto-generated constructor stub
	}
	
     
>>>>>>> b4ddc9c49a36789b96fe10642893dc2970bde42b

}
