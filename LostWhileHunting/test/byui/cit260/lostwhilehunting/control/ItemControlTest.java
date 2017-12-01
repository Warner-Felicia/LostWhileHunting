/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
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
     * Test of searchLocation method, of class ItemControl.
     
    @Test
    public void testSearchLocation() throws ItemControlException {
        
        
        System.out.println("searchLocation");
        ItemControl instance = new ItemControl();
        String expResult = "Knife";
        String result = instance.searchLocation();
        assertEquals(expResult, result, "Knife");
        
        System.out.println("searchLocation");
        expResult = "";
        result = instance.searchLocation();
        assertEquals(expResult, result, "");
        
        System.out.println("searchLocation");
        expResult = "Meat";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Meat");
        
        
        System.out.println("searchLocation");
        expResult = "Rifle";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Rifle");
        
        
        System.out.println("searchLocation");
        expResult = "Bullets";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Bullets");
        
             
        System.out.println("searchLocation");
        expResult = "ExtraLife";
        result = instance.searchLocation();
        assertEquals(expResult, result, "ExtraLife");
        
                
    }*/

    /**
     * Test of generateItemFromItems method, of class ItemControl.
     
    @Test
    public void testGenerateItemFromItems() throws ItemControlException {
        System.out.println("generateItemFromItems");
        ItemControl instance = new ItemControl();
        String expResult = "";
        String result = instance.generateItemFromItems();
        assertEquals(expResult, result);
        
        
        System.out.println("\ngenerateItemFromItems ExtraLife Test");
        expResult = "ExtraLife";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            System.out.println("Another Item returned "+result);
        }
        
        System.out.println("\ngenerateItemFromItems Meat Test");
        expResult = "Meat";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            System.out.println("Another Item returned "+result);
        }
        
        System.out.println("\ngenerateItemFromItems Rifle Test");
        expResult = "Rifle";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            System.out.println("Another Item returned "+result);
        }
        
        System.out.println("\ngenerateItemFromItems Map test");
        expResult = "Map";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            System.out.println("Another Item returned "+result);
        }
        
        System.out.println("\ngenerateItemFromItems Knife Test");
        expResult = "Knife";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            System.out.println("Another Item returned "+result);
        }
    }*/

    /**
     * Test of addToInventory method, of class ItemControl.
     
    @Test
    public void testAddToInventory() throws ItemControlException {
        System.out.println("addToInventory");
        String newItem = "Meat";
        ItemControl instance = new ItemControl();
        int expResult = 1;
        int result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("addToInventory");
        newItem = "Rifle";
        expResult = 2;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("addToInventory");
        newItem = "Bullets";
        expResult = 3;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("addToInventory");
        newItem = "Map";
        expResult = 4;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("addToInventory");
        newItem = "ExtraLife";
        expResult = 5;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("addToInventory");
        newItem = "Knife";
        expResult = 6;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        
        
    }*/

    /**
     * Test of equipItem method, of class ItemControl.
     
    @Test
    public void testEquipItem() throws ItemControlException {
        System.out.println("equipItem");
        String item = "Meat";
        ItemControl instance = new ItemControl();
        
        System.out.println("Itemfeedback: "+instance.);
        // TODO review the generated test code and remove the default call to fail.
       
    }*/
    
    
    
}
