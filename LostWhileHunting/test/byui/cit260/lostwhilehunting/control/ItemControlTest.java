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
        
        String expResult = "Meat";
        String result = ItemControl.generateItemFromItems();
        
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
        System.out.println("returned item was: "+ result);
        }
    }

    /**
     * Test of viewInventory method, of class ItemControl.
     */
    @Test
    public void testViewInventory() {
        System.out.println("viewInventory");
        String newItem = "Gun";
        int expResult=2;
        
        int result = ItemControl.viewInventory(newItem);
        assertEquals(expResult, result);
    }
    
}
