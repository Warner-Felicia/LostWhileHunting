/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author New User
 */
public class QuestionsAndSceneControlTest {
    
    public QuestionsAndSceneControlTest() {
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
    public void testLoadCombatActions() {
        System.out.println("loadCombatActions");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        
        //define the input variables
        String hero = "burlyMan";
        String item1 = "knife";
        String item2 = "";
        String item3 = "";
        double successFailureBoundary = 70;
        double returnNumber = 1;
        
        // call the method
        double result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        assertEquals(returnNumber, result, 1);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        hero = "topshotYoungster";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        successFailureBoundary = 70;
        returnNumber = 1;
        
        // call the method
        result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        assertEquals(returnNumber, result, 1);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        hero = "spinster";
        item1 = "rifle";
        item2 = "meat";
        item3 = "knife";
        successFailureBoundary = 70;
        returnNumber = 1;
        
        // call the method
        result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        assertEquals(returnNumber, result, 1);
        
        // --- Test case 4 --
        System.out.println("\tTest case 4");
        hero = "burlyMan";
        item1 = "";
        item2 = "";
        item3 = "";
        successFailureBoundary = 60;
        returnNumber = 1;
        
        // call the method
        result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        assertEquals(returnNumber, result, 1);
        
        // --- Test case 5 --
        System.out.println("\tTest case 5");
        hero = "";
        item1 = "meat";
        item2 = "rifle";
        item3 = "";
        successFailureBoundary = 70;
        returnNumber = 99999;
        
        // call the method
        result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        assertEquals(returnNumber, result, 99999);
        
        
        
        
        
        
        
    }
    
     
    
}
