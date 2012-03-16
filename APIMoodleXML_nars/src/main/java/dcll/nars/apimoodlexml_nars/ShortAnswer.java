package dcll.nars.apimoodlexml_nars;

import org.jdom.*;

public class ShortAnswer extends Question{
	private String answer;
	
	public ShortAnswer(String intitule, String type, String answer) {
		super(intitule, type);
		// TODO Auto-generated constructor stub
		this.answer = answer;
	}
	
	public void addContents(){
		addAnwser();
		
		/* A mettre dans la classe Answer */
		Element answerElement = new Element("answer");
		Attribute answerAttribute = new Attribute ("fraction", "100");
		answerElement.setAttribute(answerAttribute);
		question.addContent(answerElement);

		Element text = new Element("text");
		text.setText(answer);
		answerElement.addContent(text);
		Element feedback = new Element("feedback");
		answerElement.addContent(feedback);
		Element textFeedBack = new Element("text");
		textFeedBack.setText("Correct!");
		feedback.addContent(textFeedBack);
		/* fin Answer */
	}
}
