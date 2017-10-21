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

    /**
     * Test of loadSimpleSceneIfNotMajorMapCoord method, of class LocationsControl.
     */
    @Test
    public void testLoadSimpleSceneIfNotMajorMapCoord() {
        
        System.out.println("loadSimpleSceneIfNotMajorMapCoord");
        System.out.println();
        System.out.println();
        
        // --- Test Case #1 --- 
        System.out.println("Test Case 1");
        int column = 0;
        int row = 0;
        double expResult = 3.0;
        double result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1);  
        
         // --- Test Case #2 --- 
        System.out.println();
        System.out.println();
        System.out.println("Test Case 2");
        column = 3;
        row = 3;
        expResult = 3.0;
        result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1); 
        
        // --- Test Case #3 --- 
        System.out.println();
        System.out.println();
        System.out.println("Test Case 3");
        column = 5;
        row = 5;
        expResult = 3.0;
        result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1);
        
        // --- Test Case #4 --- 
        System.out.println();
        System.out.println();
        System.out.println("Test Case 4");
        column = 7;
        row = 7;
        expResult = 3.0;
        result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1); 
        
         // --- Test Case #5 --- 
        System.out.println();
        System.out.println();
        System.out.println("Test Case 5");
        column = 1;
        row = 1;
        expResult = 5.0;
        result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1);
        
          // --- Test Case #6 --- 
        System.out.println();
        System.out.println();
        System.out.println("Test Case 6");
        column = 5;
        row = 4;
        expResult = 5.0;
        result = LocationsControl.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 1);
    }
  
}
