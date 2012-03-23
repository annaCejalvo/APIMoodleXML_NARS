package dcll.nars.apimoodlexml_nars;

import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dcll.nars.apimoodlexml_nars.write_questions.Question;

public class QuestionTest {
	Question question;

	@Before
	public void setUp() {
		question = new Question("question de test", "it's not null ?");
	}

	@After
	public void tearDown() {
		question = null;
	}

	@Test
	public void testQuestionNotNull() {
		assertNotNull(question.getNomQ());
		assertNotNull(question.getQuestion());
		assertNotNull(question.getTextQ());
		assertNotNull(question.getAnswers());
	}
}