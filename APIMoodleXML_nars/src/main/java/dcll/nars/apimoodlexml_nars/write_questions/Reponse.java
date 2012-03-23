package dcll.nars.apimoodlexml_nars.write_questions;

import org.jdom.Attribute;
import org.jdom.Element;

public class Reponse {
	//private Question question; 
	private String textR;
	private String feedBackR;
	private float fractionR;
	
	private Element reponse = new Element("reponse");
	/**
	 * constructeur d'une reponse
	 * @param txtReponse : intitule de question
	 * @param  feedB : feed back sur la reponse
	 * @param i : fraction de la reponse
	 */
	
	public Reponse(String txtReponse, String feedB, float i) {

		this.textR = txtReponse;
		this.feedBackR = feedB;
		this.fractionR = i;	
		
		initResponse();

	}

	public Reponse(Element elem) {
		
		textR = elem.getChildText("text");
		feedBackR = elem.getChild("feedback").getChildText("text");
		
		try{
			fractionR = Integer.parseInt(elem.getAttributeValue("fraction"));
		}catch (Exception e) {
			fractionR = Float.parseFloat(elem.getAttributeValue("fraction"));
		}
		
		
		System.out.println(textR +"/"+feedBackR+"/"+fractionR);
		
		initResponse();
		
	}
	
	private void initResponse() {
		Attribute fraction = new Attribute("fraction", ""+fractionR);
		reponse.setAttribute(fraction);
		if(textR.equals("")){
			Element text = new Element("text");
			text.setText(textR);
			reponse.addContent(text);
		}
		
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
