/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import lostwhilehunting.LostWhileHunting;



/**
 *
 * @author New User
 */
public final class Items implements Serializable{
    
           
    private static String item1 = "";
    private static String item2 = "";
    private static String item3 = "";
    private static PrintWriter console = LostWhileHunting.getOutFile();

    public static String getItem1() {
        return item1;
    }

    public static void setItem1(String item1) {
        Items.item1 = item1;
        Items.console.println("\n"+item1+" placed in Item 1 and replicated to inventory");
    }

    public static String getItem2() {
        return item2;
    }

    public static void setItem2(String item2) {
        Items.item2 = item2;
    }

    public static String getItem3() {
        return item3;
    }

    public static void setItem3(String item3) {
        Items.item3 = item3;
    }

    public Items() {
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
    

    
    
   
    
    
}

   
