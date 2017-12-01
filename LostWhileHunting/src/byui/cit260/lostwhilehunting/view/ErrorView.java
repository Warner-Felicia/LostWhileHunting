/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.view;

import java.io.PrintWriter;
import java.io.Serializable;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author New User
 */
public class ErrorView implements Serializable{
    
    private static final PrintWriter errorFile = LostWhileHunting.getOutFile();
    private static final PrintWriter logFile = LostWhileHunting.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
          "_______________________________________________________"
        + "\n- Error -" + errorMessage
        + "_______________________________________________________");
        try {
            
            logFile.println(className + " - " + errorMessage);
            
            logFile.flush();
        } catch (Exception e) {
            LostWhileHunting.getOutFile().println("Error writing to log file.");
        }
    }
    
}
