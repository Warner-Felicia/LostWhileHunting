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
        System.out.println("incrementLocationsMapSceneTypeIfSurePass");
        int surePass = 4;
        LocationsControl instance = new LocationsControl();
        double expResult = 1.0;
        double result = instance.incrementLocationsMapSceneTypeIfSurePass(surePass);
        assertEquals(expResult, result, 1.0);
        
    }

    /**
     * Test of loadSimpleSceneIfNotMajorMapCoord method, of class LocationsControl.
     */
    @Test
    public void testLoadSimpleSceneIfNotMajorMapCoord() {
        System.out.println("loadSimpleSceneIfNotMajorMapCoord");
        int column = 0;
        int row = 0;
        LocationsControl instance = new LocationsControl();
        double expResult = 3.0;
        double result = instance.loadSimpleSceneIfNotMajorMapCoord(column, row);
        assertEquals(expResult, result, 3.0);
        
    }
    
}
