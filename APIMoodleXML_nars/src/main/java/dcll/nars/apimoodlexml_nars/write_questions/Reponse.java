package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Reponse {
	//private Question question; 
	private String textR;
	private String feedBackR;
	private float fractionR;
	
	private Element reponse = new Element("answer");

	public Reponse(String txtReponse, String feedB, float i) {

		this.textR = txtReponse;
		this.feedBackR = feedB;
		this.fractionR = i;	
		
		initResponse();

	}

	public Reponse(Element elem) {
		System.out.println("REP-cons");
		textR = elem.getChildText("text");
		System.out.println("REP-sdfgg");
		feedBackR = elem.getChild("feedback").getChildText("text");
		
		try{
			fractionR = Integer.parseInt(elem.getAttributeValue("fraction"));
		}catch (Exception e) {
			fractionR = Float.parseFloat(elem.getAttributeValue("fraction"));
		}
		
		
		System.out.println("3333333333"+textR +"/"+feedBackR+"/"+fractionR);
		
		initResponse();
		
	}
	
	private void initResponse() {
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
		
		System.out.println(reponse.getChildren().toString());
	}

	public Element getReponseElement() {
		return reponse;
	}
}
