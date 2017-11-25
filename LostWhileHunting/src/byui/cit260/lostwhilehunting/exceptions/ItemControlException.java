/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.exceptions;

/**
 *
 * @author Administrator
 */
public class ItemControlException extends Exception{
    
    String message="Item Error, something went wrong in the Inventory";

    public ItemControlException() {
    }

    public ItemControlException(String message) {
        super(message);
    }

    public ItemControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemControlException(Throwable cause) {
        super(cause);
    }

    public ItemControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
