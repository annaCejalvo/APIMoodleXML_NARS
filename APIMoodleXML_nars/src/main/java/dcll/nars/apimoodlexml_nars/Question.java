package dcll.nars.apimoodlexml_nars;

import org.jdom.Attribute;
import org.jdom.Element;

public class Question {
	//private List<String> answer;
	private String intitule;
	private String type;

	static Element question = new Element("question");
	
	public Question(String intitule, String type){
		this.intitule = intitule;
		this.type = type;
		
		Attribute questionAttribute = new Attribute("type", this.type);
		question.setAttribute(questionAttribute);
	}
	
	public void addAnwser(){
		
	}

}
