package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Reponse {
	//private Question question; 
	private String textR;
	private String feedBackR;
	private int fractionR;
	
	Element reponse = new Element("reponse");

	public Reponse(String txtReponse, String feedB, int frac) {

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

	}

	public Element getReponseElement() {
		return reponse;
	}
}
