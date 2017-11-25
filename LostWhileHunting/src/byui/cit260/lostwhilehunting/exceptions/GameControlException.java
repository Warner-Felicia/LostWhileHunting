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
public class GameControlException extends Exception{

        String message;

    public GameControlException() {
    }

    public GameControlException(String string) {
        super(string);
    }

    public GameControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GameControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GameControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
