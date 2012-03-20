package dcll.nars.apimoodlexml_nars;

import org.jdom.Attribute;
import org.jdom.Element;

public class Reponse {
	//private Question question; 
	private String textR;
	private String feedBackR;
	private float fractionR;
	
	Element reponse = new Element("reponse");

	public Reponse(/*Question quest, */String txtReponse, String feedB, float frac) {
		//this.question = quest;
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
		//Question.getQuestionElement().addContent(reponse);
	}

	public Element getReponseElement() {
		return reponse;
	}
}
