/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import lostwhilehunting.LostWhileHunting;

/**
 *
 * @author Administrator
 */
public class InventoryItem implements Serializable, Comparable<InventoryItem> {

    // review later
    
    
    private String inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    
    public InventoryItem() {
    
           
    }

    public InventoryItem(String inventoryType, int quantityInStock, int requiredAmount) {
    
            this.setInventoryType(inventoryType);
            this.setQuantityInStock(quantityInStock);
            this.setRequiredAmount(requiredAmount);
    }

    public static ArrayList createItem() {
        
        ArrayList<InventoryItem> itemsArray = new ArrayList<>();
        
        InventoryItem rifle = new InventoryItem("Rifle", 0, 0);
        itemsArray.add(rifle);
        
        InventoryItem bullets = new InventoryItem("Bullets", 0, 0);
        itemsArray.add(bullets);
        
        InventoryItem meat = new InventoryItem("Meat", 0, 0);
        itemsArray.add(meat);
        
        InventoryItem map = new InventoryItem("Map", 0, 0);
        itemsArray.add(map);
           
        InventoryItem knife = new InventoryItem("Knife", 0, 0);
        itemsArray.add(knife);
        
        InventoryItem extraLife = new InventoryItem("Extra Life", 0, 0);
        itemsArray.add(extraLife);
        
        // testing our ArrayList
        for (int i = 0; i < itemsArray.size(); i++) {
            
            InventoryItem item = itemsArray.get(i);
            LostWhileHunting.getOutFile().println("\n\tItem: " + item.getInventoryType()
                    + "\n\tQuantity: " + item.getQuantityInStock()
                    + "\n\tRequired: " + item.getRequiredAmount());
                    
        }
        return itemsArray; 
    }
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    public int compareTo(InventoryItem compareInventoryItem) {
        
        int compareQuantity = ((InventoryItem) compareInventoryItem).getQuantityInStock();
        
        return this.quantityInStock - compareQuantity;
    }
    
    public static Comparator<InventoryItem> ItemNameComparator
                          = new Comparator<InventoryItem>() {

	    public int compare(InventoryItem item1, InventoryItem item2) {

	      String itemName1 = item1.getInventoryType().toUpperCase();
	      String itemName2 = item2.getInventoryType().toUpperCase();

	      return itemName1.compareTo(itemName2);

	    }

	};
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.inventoryType);
        hash = 83 * hash + this.quantityInStock;
        hash = 83 * hash + this.requiredAmount;
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return " "+this.getInventoryType() + "      " +"      " + this.getQuantityInStock() + "         " + "        "+ this.getRequiredAmount() + "       \n";
                //super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
