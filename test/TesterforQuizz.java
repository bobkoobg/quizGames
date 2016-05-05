/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import control.Controller;
import interfaces.QuizzControlInterface;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Boyko
 */
public class TesterforQuizz
{

    Controller control;

    @Before
    public void setUp()
    {
        control = new Controller();
        
    }

//    @Test THIS TEST IS OPTIONAL BECAUSE THE LENGTH IS INCREASING
//    public void testgetGameNames_1()
//    {
//        //after adding brand new testing values to file
//        assertFalse(control.getGameNames().length == 3);
//    }

    @Test
    public void testgetGameNames_2()
    {
        
        assertFalse(control.getGameNames().length == 4);
    }

    @Test
    public void testgetGameNames_3()
    {
        
        assertFalse(control.getGameNames().length == 0);
    }

    @Test
    public void testgetGameNames_4()
    {
        assertFalse(control.getGameNames().length == 1);
    }

    @Test
    public void testSelectedGameNames_1()
    {
        assertTrue(control.getGameNames()[0].equalsIgnoreCase("Capitals"));
    }

    @Test
    public void testSelectedGameNames_2()
    {
        assertTrue(control.getGameNames()[2].equalsIgnoreCase("Randomise"));
    }

    @Test
    public void testSelectedGameNames_3()
    {
        assertFalse(control.getGameNames()[0].equals(control.getGameNames()[1]));
    }

//    @Test THIS TEST IS OPTIONAL BECAUSE THE LENGTH IS INCREASING
//    public void testSelectedGameNames_4()
//    {
//        assertFalse(control.getGameNames()[4] == null);
//    }

    @Test
    public void testSelectedGameNames_5()
    {
        assertFalse(control.getGameNames() == null);
    }

    @Test
    public void testIfLoadReads_1()
    {
        assertTrue(control.load("Capitals.txt"));   
    }
    @Test
    public void testIfLoadReads_2()
    {
        boolean temp = control.load("AHAHHAXHXHAXHAXHAHAX.txt");
        assertFalse("expected fals. Got> " + temp ,temp);
    }
    @Test
    public void testIfLoadReads_3()
    {
        assertTrue(control.getGameNames()[0].equalsIgnoreCase("Capitals"));
    }

    @Test
    public void testAddNametoGameNames()
    {
        control.addGame("TestingGame");
        assertTrue(control.getGameNames()[3].equalsIgnoreCase("TestingGame"));
    }
//    @Test THIS TEST IS OPTIONAL BECAUSE IT'S CREATING A BRAND NEW FILE 
//    public void testCreationofFile()
//    {
//        control.createNewFile("TestingGame.txt");
//        assertTrue(control.load("TestingGame.txt"));
//    }
}