/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.exceptions;

/**
 *
 * @author New User
 */
public class QuestionsAndSceneControlException extends Exception{

    String message = "No hero detected";
    
    public QuestionsAndSceneControlException() {
    }

    public QuestionsAndSceneControlException(String string) {
        super(string);
    }

    public QuestionsAndSceneControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public QuestionsAndSceneControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public QuestionsAndSceneControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
}
