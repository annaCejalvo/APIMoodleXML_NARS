package dcll.nars.apimoodlexml_nars;

import java.util.List;

import org.jdom.Attribute;
import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;

public class Reponse {
	private Question question; 
	private String textR;
	private String feedBackR;
	private float fractionR;
	
	static Element reponse = new Element("reponse");

	public static Element getReponse() {
		return reponse;
	}

	public Reponse(Question quest, String txtReponse, String feedB, float frac) {
		this.question = quest;
		this.textR = txtReponse;
		this.feedBackR = feedB;
		this.fractionR = frac;	
		
		Attribute fraction = new Attribute("fraction", ""+fractionR);
		reponse.setAttribute(fraction);
		Element text = new Element("text");
		text.setText(textR);
		reponse.addContent(text);
		Element feedback = new Element("feedback");
		Element textFeedback = new Element("text");
		textFeedback.setText(feedBackR);
		feedback.addContent(textFeedback);
		reponse.addContent(feedback);
		Question.getQuestionElement().addContent(reponse);
	
	}

}
