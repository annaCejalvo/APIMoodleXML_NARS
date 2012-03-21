package dcll.nars.apimoodlexml_nars.write_questions;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Element;

public class Quiz {
	private static Element quiz = new Element("quiz");
	private List<Question> questions;
	
	public Quiz(){
		questions = new ArrayList<Question>();
	}
	public Quiz(Element elem) {
		// TODO Auto-generated constructor stub
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
