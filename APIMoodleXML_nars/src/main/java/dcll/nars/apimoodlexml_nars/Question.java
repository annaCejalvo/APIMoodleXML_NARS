package dcll.nars.apimoodlexml_nars;

import java.io.FileOutputStream;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class Question {
	//private List<String> reponses;
	private String intitule;
	private String type;

	static Element question = new Element("question");
	
	public Question(String intitule, String type){
		this.intitule = intitule;
		this.type = type;
		
		Attribute questionAttribute = new Attribute("type", this.type);
		question.setAttribute(questionAttribute);
	}

}
