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
        
        // call the method
        double result = QuestionsAndSceneControl.loadCombatActions(hero, item1, item2, item3);
         
        // test to see if the result returned equals the expected result
        
        fail("The test case is a prototype.");
    }
    
     
    
}
