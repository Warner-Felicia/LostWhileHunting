/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

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
    public void testLoadCombatActions() {
        System.out.println("loadCombatActions");
        String hero = "BurlyMan";
        String item1 = "Knife";
        String item2 = "Rifle";
        String item3 = "";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        double expResult = 1.0;
        double result = instance.loadCombatActions(hero, item1, item2, item3);
        assertEquals(expResult, result, 1.0);
        
    }

    /**
     * Test of loadFlightActions method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testLoadFlightActions() {
        System.out.println("loadFlightActions");
        String hero = "YoungTopShot";
        String item1 = "Gun";
        String item2 = "Bullets";
        String item3 = "Knife";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        double expResult = 0.0;
        double result = instance.loadFlightActions(hero, item1, item2, item3);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of loadEvadeActions method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testLoadEvadeActions() {
        System.out.println("loadEvadeActions");
        String hero = "Spinster";
        String item1 = "Map";
        String item2 = "ExtraLife";
        String item3 = "Knife";
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        double expResult = 1.0;
        double result = instance.loadEvadeActions(hero, item1, item2, item3);
        assertEquals(expResult, result, 1.0);
        
    }

    /**
     * Test of checkSceneQuestionChoiceAndReturnNewScene method, of class QuestionsAndSceneControl.
     */
    @Test
    public void testCheckSceneQuestionChoiceAndReturnNewScene() {
        System.out.println("checkSceneQuestionChoiceAndReturnNewScene");
        QuestionsAndSceneControl instance = new QuestionsAndSceneControl();
        instance.checkSceneQuestionChoiceAndReturnNewScene();
        
    }
    
}
