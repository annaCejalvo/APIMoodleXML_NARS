package dcll.nars.apimoodlexml_nars;

import java.io.*;
import org.jdom.*;
import org.jdom.output.*;

public class ShortAnswer extends Question{

	static Element racine = new Element("question");
	
	static org.jdom.Document document = new Document(racine);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Element answer = new Element("answer");
		racine.addContent(answer);
		

	}

}
