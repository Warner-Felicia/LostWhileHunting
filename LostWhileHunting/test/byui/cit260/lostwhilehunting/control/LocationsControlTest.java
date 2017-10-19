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
public class LocationsControlTest {
    
    public LocationsControlTest() {
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
     * Test of incrementLocationsMapSceneTypeIfSurePass method, of class LocationsControl.
     */
    @Test
    public void testIncrementLocationsMapSceneTypeIfSurePass() {
        
        //Test Scenario 1 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 1");
        int surePass = 4;
        double expResult = 1;
        double result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 1 Ends
        
        //Test Scenario 2 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 2");
        surePass = 3;
        expResult = 1;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 2 Ends
        
        //Test Scenario 3 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 3");
        surePass = 2;
        expResult = 1;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 3 Ends
        
        //Test Scenario 4 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 4");
        surePass = 1;
        expResult = 1;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 4 Ends
        
        //Test Scenario 5 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 5");
        surePass = 0;
        expResult = 99999;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 5 Ends
        
        //Test Scenario 6 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 6 * Bonus");
        surePass = -1;
        expResult = 99999;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 6 Ends
        
        //Test Scenario 7 Starts
        
        System.out.println();
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        System.out.println();
        System.out.println("Sure Pass - Test Scenario 7 * Bonus");
        surePass = -1;
        expResult = 99999;
        result = LocationsControl.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1);
        
        //Test Scenario 7 Ends
        
    }
    
}
