/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.control;

import byui.cit260.lostwhilehunting.exceptions.ItemControlException;
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
public class ItemControlTest {
    
    PrintWriter console = LostWhileHunting.getOutFile();
    
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
        
        
        this.console.println("searchLocation");
        ItemControl instance = new ItemControl();
        String expResult = "Knife";
        String result = instance.searchLocation();
        assertEquals(expResult, result, "Knife");
        
        this.console.println("searchLocation");
        expResult = "";
        result = instance.searchLocation();
        assertEquals(expResult, result, "");
        
        this.console.println("searchLocation");
        expResult = "Meat";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Meat");
        
        
        this.console.println("searchLocation");
        expResult = "Rifle";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Rifle");
        
        
        this.console.println("searchLocation");
        expResult = "Bullets";
        result = instance.searchLocation();
        assertEquals(expResult, result, "Bullets");
        
             
        this.console.println("searchLocation");
        expResult = "ExtraLife";
        result = instance.searchLocation();
        assertEquals(expResult, result, "ExtraLife");
        
                
    }*/

    /**
     * Test of generateItemFromItems method, of class ItemControl.
     
    @Test
    public void testGenerateItemFromItems() throws ItemControlException {
        this.console.println("generateItemFromItems");
        ItemControl instance = new ItemControl();
        String expResult = "";
        String result = instance.generateItemFromItems();
        assertEquals(expResult, result);
        
        
        this.console.println("\ngenerateItemFromItems ExtraLife Test");
        expResult = "ExtraLife";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            this.console.println("Another Item returned "+result);
        }
        
        this.console.println("\ngenerateItemFromItems Meat Test");
        expResult = "Meat";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            this.console.println("Another Item returned "+result);
        }
        
        this.console.println("\ngenerateItemFromItems Rifle Test");
        expResult = "Rifle";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            this.console.println("Another Item returned "+result);
        }
        
        this.console.println("\ngenerateItemFromItems Map test");
        expResult = "Map";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            this.console.println("Another Item returned "+result);
        }
        
        this.console.println("\ngenerateItemFromItems Knife Test");
        expResult = "Knife";
        result = instance.generateItemFromItems();
        if(expResult == result){
        assertEquals(expResult, result);
        }else{
            this.console.println("Another Item returned "+result);
        }
    }*/

    /**
     * Test of addToInventory method, of class ItemControl.
     
    @Test
    public void testAddToInventory() throws ItemControlException {
        this.console.println("addToInventory");
        String newItem = "Meat";
        ItemControl instance = new ItemControl();
        int expResult = 1;
        int result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        this.console.println("addToInventory");
        newItem = "Rifle";
        expResult = 2;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        this.console.println("addToInventory");
        newItem = "Bullets";
        expResult = 3;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        this.console.println("addToInventory");
        newItem = "Map";
        expResult = 4;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        this.console.println("addToInventory");
        newItem = "ExtraLife";
        expResult = 5;
        result = instance.addToInventory(newItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        this.console.println("addToInventory");
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
        this.console.println("equipItem");
        String item = "Meat";
        ItemControl instance = new ItemControl();
        
        this.console.println("Itemfeedback: "+instance.);
        // TODO review the generated test code and remove the default call to fail.
       
    }*/
    
    
    
}
