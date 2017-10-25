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
public class ItemControlTest {
    
    public ItemControlTest() {
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
     * Test of generateItemFromItems method, of class ItemControl.
     */
    @Test
    public void testGenerateItemFromItems() {
        System.out.println("generateItemFromItems");
        ItemControl instance = new ItemControl();
        String expResult = "";
        String result = instance.generateItemFromItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewInventory method, of class ItemControl.
     */
    @Test
    public void testViewInventory() {
        System.out.println("viewInventory");
        String newItem = "";
        ItemControl instance = new ItemControl();
        int expResult = 0;
        int result = instance.viewInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
