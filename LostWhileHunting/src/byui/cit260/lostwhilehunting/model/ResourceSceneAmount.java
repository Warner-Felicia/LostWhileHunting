/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;

/**
 *
 * @author New User
 */
public class ResourceSceneAmount implements Serializable{
    
    private int amount;
    private Items items;

    public ResourceSceneAmount() {
    }

    public int getAmount() {
        return amount;
    }

    public Items getItems() {
        return items;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.amount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResourceSceneAmount other = (ResourceSceneAmount) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceSceneAmount{" + "amount=" + amount + '}';
    }
    
    
    
}
