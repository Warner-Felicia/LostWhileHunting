/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.exceptions.QuestionsAndSceneControlException;
import java.io.PrintWriter;
import lostwhilehunting.LostWhileHunting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class QuestionsAndSceneControlTest {
    
    PrintWriter console = LostWhileHunting.getOutFile();
    
    public QuestionsAndSceneControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadCombatActions method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testLoadCombatActions() throws QuestionsAndSceneControlException {
        this.console.println("loadCombatActions");
        
        // --- Test case 1 ---
        this.console.println("\tTest case 1");
        
        //define the input variables
        String hero = "burlyMan";
        String item1 = "knife";
        String item2 = "";
        String item3 = "";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        //define the expected result
        double expResult = 1.0;
        
        // call the method
        double result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        
        // --- Test case 2 ---
        this.console.println("\tTest case 2");
        hero = "topshotYoungster";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 1);
        
        // --- Test case 3 ---
        this.console.println("\tTest case 3");
        hero = "spinster";
        item1 = "rifle";
        item2 = "meat";
        item3 = "knife";
                
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);         
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 1);
        
        // --- Test case 4 --
        this.console.println("\tTest case 4");
        hero = "burlyMan";
        item1 = "";
        item2 = "";
        item3 = "";
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);         
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 1);
        
        // --- Test case 5 --
        this.console.println("\tTest case 5");
        hero = "";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        //define the expected result
        expResult = 99999;
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);         
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result, 1);   
    }
    
    /**
     * Test of loadFlightActions method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testLoadFlightActions() throws QuestionsAndSceneControlException {
        this.console.println("loadFlightActions");
        
        // Test Case 1
        this.console.println("\tTest Case 1");
        
        //define input variables
        String hero = "BurlyMan";
        String item1 = "knife";
        String item2 = "";
        String item3 = "";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        //define the expected result
        double expResult = 1.0;
        
        // call the method
        double result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 2
        this.console.println("\tTest Case 2");
        
        //define input variables
        hero = "TopshotYoungster";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 3
        this.console.println("\tTest Case 3");
        
        //define input variables
        hero = "Spinster";
        item1 = "rifle";
        item2 = "meat";
        item3 = "knife";
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 4
        this.console.println("\tTest Case 4");
        
        //define input variables
        hero = "BurlyMan";
        item1 = "";
        item2 = "";
        item3 = "";
        
        //define the expected result
        expResult = 0.0;
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
            
        // Test Case 5
        this.console.println("\tTest Case 5");
        
        //define input variables
        hero = "";
        item1 = "rifle";
        item2 = "";
        item3 = "meat";
        
        //define the expected result
        expResult = 99999;
        
        // call the method
        result = instance.loadFlightActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of loadEvadeActions method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testLoadEvadeActions() throws QuestionsAndSceneControlException {
        this.console.println("loadEvadeActions");
        
        // Test Case 1
        this.console.println("\tTest Case 1");
        
        //define input variables
        String hero = "BurlyMan";
        String item1 = "knife";
        String item2 = "";
        String item3 = "";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        //define the expected result
        double expResult = 1.0;
        
        // call the method
        double result = instance.loadEvadeActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 2
        this.console.println("\tTest Case 2");
        
        //define input variables
        hero = "TopshotYoungster";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        
        // call the method
        result = instance.loadEvadeActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 3
        this.console.println("\tTest Case 3");
        
        //define input variables
        hero = "Spinster";
        item1 = "rifle";
        item2 = "meat";
        item3 = "knife";
        
        // call the method
        result = instance.loadEvadeActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
        
        // Test Case 4
        this.console.println("\tTest Case 4");
        
        //define input variables
        hero = "BurlyMan";
        item1 = "";
        item2 = "";
        item3 = "";
        
        //define the expected result
        expResult = 0.0;
        
        // call the method
        result = instance.loadEvadeActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
            
        // Test Case 5
        this.console.println("\tTest Case 5");
        
        //define input variables
        hero = "";
        item1 = "rifle";
        item2 = "";
        item3 = "meat";
        
        //define the expected result
        expResult = 99999;
        
        // call the method
        result = instance.loadEvadeActions(hero, item1, item2, item3);
        // test to see if results match expected results
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of checkSceneQuestionChoiceAndReturnNewScene method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testCheckSceneQuestionChoiceAndReturnNewScene() {
        this.console.println("checkSceneQuestionChoiceAndReturnNewScene");
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        instance.checkSceneQuestionChoiceAndReturnNewScene();
        
    }
    
}
