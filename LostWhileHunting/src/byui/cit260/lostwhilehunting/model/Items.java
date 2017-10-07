/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;



/**
 *
 * @author New User
 */
public enum Items {
    
    Rifle("weapon", 25, "not equipped"),
    Bullets("ammunition", 25, "not equipped"),
    SharpKnife("weapon", 25, "not equipped"),
    MeatFromAnimals("food", 25, "not equipped"),
    AnOldMap("map", 10, "not equipped"),
    ExtraLife("health", 5, "not equipped");
    
    private String type;
    private int quantityInStock;
    private String status;
    
    Items(String type, int quantityInStock, String status) {
        this.type = type;
        this.quantityInStock = quantityInStock;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", quantityInStock=" + quantityInStock + ", status=" + status + '}';
    }
    
    
}

   
