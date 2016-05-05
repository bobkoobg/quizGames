
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import control.Controller;
import interfaces.WordPairControlInterface;

public class Tester
{

    private static String fileName = getFilenameGuid();
    WordPairControlInterface Control;

    private static String getFilenameGuid()
    {
        String name = "C:\\Users\\Boyko\\Documents\\NetBeansProjects\\Flow3c\\" + UUID.randomUUID().toString() + ".txt";
        System.out.println(name);
        return name;

    }

    public Tester()
    {
    }

    @Before
    public void setUp()
    {
        //Replace WordPairDemoV1 with your own controller
        Control = new Controller();
        assertTrue(Control.size() == 0);
        Control.add("hest", "horse");      // trust add()
        Control.add("hus", "house");
        Control.add("båd", "boat");
    }

    @After
    public void tearDown()
    {
    }

    @Test
    /**
     * This test requires that both save and load are implemented, since the
     * test strategy is: Save the file, clear the content of the list, and read
     * the file back in and check the result.
     */
    public void testLoad()
    {
        assertTrue(Control.save(fileName));
        Control.clear();
        assertTrue(Control.load(fileName));
        assertTrue(Control.size() == 3);
        assertEquals(Control.lookup("hest"), "horse");
        assertEquals(Control.lookup("hus"), "house");
        assertEquals(Control.lookup("båd"), "boat");
    }

    @Test
    /**
     * This test is redundant (covered by testLoad).
     */
    public void testSave()
    {
    }

    @Test
    public void testLookup()
    {
        assertEquals(Control.lookup("hest"), "horse");
        assertNotSame(Control.lookup("hest"), "Cow");
    }

    @Test
    public void testClear()
    {
        Control.clear();
        assertTrue(Control.size() == 0);
    }

    @Test
    public void testAdd()
    {
        Control.add("ko", "cow");
        assertTrue(Control.size() == 4);
        assertEquals(Control.lookup("ko"), "cow");
    }

    @Test
    /**
     * This does not test the distribution, but if we belive in the random
     * generators it tests the "border values" in that all possible values must
     * be generated
     */
    public void testGetRandomQuestion()
    {
        int testTries = 30;
        boolean horseFound = false;
        boolean houseFound = false;
        boolean boatFound = false;

        for (int i = 0; i < testTries; i++)
        {
            String question = Control.getRandomQuestion();
            if (question.equals("hest"))
            {
                horseFound = true;
            }
            if (question.equals("hus"))
            {
                houseFound = true;
            }
            if (question.equals("båd"))
            {
                boatFound = true;
            }
        }
        assertTrue(horseFound && houseFound && boatFound);
    }

    @Test
    public void testCheckGuess()
    {
        assertTrue(Control.checkGuess("hest", "horse"));
        assertFalse(Control.checkGuess("hest", "cow"));
    }

    @Test
    public void testGetSize()
    {
        assertTrue(Control.size() == 3);
    }

    @Test
    public void testGameName()
    {
    }
}
