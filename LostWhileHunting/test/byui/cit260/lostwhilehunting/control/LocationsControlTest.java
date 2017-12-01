/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

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
public class LocationsControlTest {
    
    PrintWriter console = LostWhileHunting.getOutFile();
    
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
        this.console.println("\n\n\nincrementLocationsMapSceneTypeIfSurePass");
        int surePass = 4;
        LocationsControl instance = new LocationsControl();
        double expResult = 1.0;
        double result = instance.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1.0);
        
        this.console.println("\nincrementLocationsMapSceneTypeIfSurePass");
        surePass = 3;
        
        expResult = 1.0;
        result = instance.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1.0);
        
        this.console.println("\nincrementLocationsMapSceneTypeIfSurePass");
        surePass = 2;
        
        expResult = 1.0;
        result = instance.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1.0);
        
        this.console.println("\nincrementLocationsMapSceneTypeIfSurePass");
        surePass = 1;
        
        expResult = 1.0;
        result = instance.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of loadSimpleSceneIfNotMajorMapCoord method, of class LocationsControl.
     */
    @Test
    public void testLoadSimpleSceneIfNotMajorMapCoord() {
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Major Scene Check 1");
        int column = 0;
        int row = 0;
        LocationsControl instance = new LocationsControl();
        int expResult = 3;
        int result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 3);
        
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Major Scene Check 2");
        column = 3;
        row = 3;
        
        expResult = 3;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 3);
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Major Scene Check 3");
        column = 5;
        row = 5;
        
        expResult = 3;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 3);
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Major Scene Check 4");
        column = 7;
        row = 7;
        
        expResult = 3;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 3);
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Minor Scene Check 1");
        column = 1;
        row = 1;
        
        expResult = 5;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 5);
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Minor Scene Check 2");
        column = 0;
        row = 1;
        
        expResult = 5;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 5);
        
        this.console.println("\nloadSimpleSceneIfNotMajorMapCoord Minor Scene Check 3");
        column = 4;
        row = 1;
        
        expResult = 5;
        result = instance.loadSimpleSceneIfNotMajorMapCoord();
        assertEquals(expResult, result, 5);
        
        
        
    }
    
}
