package dcll.nars.apimoodlexml_nars.write_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Element;

public class Quiz {
	private static Element quiz = new Element("quiz");
	private List<Question> questions;
	
	public Quiz(){
		questions = new ArrayList<Question>();
	}
	public Quiz(Element elem) {
		questions = new ArrayList<Question>();
		List<Element> tmpLst = elem.getChildren("question");
		Iterator i = tmpLst.iterator();
		while(i.hasNext())
		{
			Element current = (Element)i.next();
			String type = current.getAttributeValue("type");
			Question q = null;
			if(type.equals("multichoice")){
				q = new MultiChoice(current);
			}else if(type.equals("truefalse")){
				q = new TrueFalseQuestion(current);
			}else if(type.equals("numerical")){
				q = new Numerical(current);
			}else if(type.equals("shortanswer")){
				q = new Numerical(current);
			}
			if(q != null)
				questions.add(q);
		}
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Question> getQuestions() {
		return questions;
	}
	
	public void addQuestion(Question e){
		questions.add(e);
		quiz.addContent(e.getQuestionElement());
	}
	
	public Element getQuizElement() {
		return quiz;
	}
	public static Element getQuiz() {
		return quiz;
	}
}
