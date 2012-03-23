package dcll.nars.apimoodlexml_nars;

<<<<<<< .merge_file_a05500
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Suite de tests du projet
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ WriteTest.class , QuestionTest.class})
public class AppTest {

=======
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
>>>>>>> .merge_file_a05900
}
