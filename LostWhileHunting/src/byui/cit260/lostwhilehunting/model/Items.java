/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.util.Arrays;
import java.util.Objects;



/**
 *
 * @author New User
 */
public class Items {
    
    /*Rifle("weapon", 25, "not equipped"),
    Bullets("ammunition", 25, "not equipped"),
    SharpKnife("weapon", 25, "not equipped"),
    MeatFromAnimals("food", 25, "not equipped"),
    AnOldMap("map", 10, "not equipped"),
    ExtraLife("health", 5, "not equipped");*/
    
     
    private String rifle = "Rifle";
    private int rifleQuantity = 0;
    private String rifleStatus = "";
    
    private String meat = "Meat";
    private int meatQuantity = 0;
    private String meatStatus = "";
    
    private String bullets = "Bullets";
    private int bulletsQuantity = 0;
    private String bulletsStatus = "";
    
    private String map = "Map";
    private int mapQuantity = 0;
    private String mapStatus = "";
    
    private String extraLife = "ExtraLife";
    private int extraLifeQuantity = 0;
    private String extraLifeStatus = "";
    
    private String knife = "Knife";
    private int knifeQuantity = 0;
    private String knifeStatus = "";
    
    private String item1 = "";
    private String item2 = "";
    private String item3 = "";

    
    public String getRifle() {
        return rifle;
    }

    public void setRifle(String rifle) {
        this.rifle = rifle;
    }

    public int getRifleQuantity() {
        return rifleQuantity;
    }

    public void setRifleQuantity(int rifleQuantity) {
        this.rifleQuantity = rifleQuantity;
    }

    public String getRifleStatus() {
        return rifleStatus;
    }

    public void setRifleStatus(String rifleStatus) {
        this.rifleStatus = rifleStatus;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public int getMeatQuantity() {
        return meatQuantity;
    }

    public void setMeatQuantity(int meatQuantity) {
        this.meatQuantity = meatQuantity;
    }

    public String getMeatStatus() {
        return meatStatus;
    }

    public void setMeatStatus(String meatStatus) {
        this.meatStatus = meatStatus;
    }

    public String getBullets() {
        return bullets;
    }

    public void setBullets(String bullets) {
        this.bullets = bullets;
    }

    public int getBulletsQuantity() {
        return bulletsQuantity;
    }

    public void setBulletsQuantity(int bulletsQuantity) {
        this.bulletsQuantity = bulletsQuantity;
    }

    public String getBulletsStatus() {
        return bulletsStatus;
    }

    public void setBulletsStatus(String bulletsStatus) {
        this.bulletsStatus = bulletsStatus;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public int getMapQuantity() {
        return mapQuantity;
    }

    public void setMapQuantity(int mapQuantity) {
        this.mapQuantity = mapQuantity;
    }

    public String getMapStatus() {
        return mapStatus;
    }

    public void setMapStatus(String mapStatus) {
        this.mapStatus = mapStatus;
    }

    public String getExtraLife() {
        return extraLife;
    }

    public void setExtraLife(String extraLife) {
        this.extraLife = extraLife;
    }

    public int getExtraLifeQuantity() {
        return extraLifeQuantity;
    }

    public void setExtraLifeQuantity(int extraLifeQuantity) {
        this.extraLifeQuantity = extraLifeQuantity;
    }

    public String getExtraLifeStatus() {
        return extraLifeStatus;
    }

    public void setExtraLifeStatus(String extraLifeStatus) {
        this.extraLifeStatus = extraLifeStatus;
    }

    public String getKnife() {
        return knife;
    }

    public void setKnife(String knife) {
        this.knife = knife;
    }

    public int getKnifeQuantity() {
        return knifeQuantity;
    }

    public void setKnifeQuantity(int knifeQuantity) {
        this.knifeQuantity = knifeQuantity;
    }

    public String getKnifeStatus() {
        return knifeStatus;
    }

    public void setKnifeStatus(String knifeStatus) {
        this.knifeStatus = knifeStatus;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.rifle);
        hash = 79 * hash + this.rifleQuantity;
        hash = 79 * hash + Objects.hashCode(this.rifleStatus);
        hash = 79 * hash + Objects.hashCode(this.meat);
        hash = 79 * hash + this.meatQuantity;
        hash = 79 * hash + Objects.hashCode(this.meatStatus);
        hash = 79 * hash + Objects.hashCode(this.bullets);
        hash = 79 * hash + this.bulletsQuantity;
        hash = 79 * hash + Objects.hashCode(this.bulletsStatus);
        hash = 79 * hash + Objects.hashCode(this.map);
        hash = 79 * hash + this.mapQuantity;
        hash = 79 * hash + Objects.hashCode(this.mapStatus);
        hash = 79 * hash + Objects.hashCode(this.extraLife);
        hash = 79 * hash + this.extraLifeQuantity;
        hash = 79 * hash + Objects.hashCode(this.extraLifeStatus);
        hash = 79 * hash + Objects.hashCode(this.knife);
        hash = 79 * hash + this.knifeQuantity;
        hash = 79 * hash + Objects.hashCode(this.knifeStatus);
        hash = 79 * hash + Objects.hashCode(this.item1);
        hash = 79 * hash + Objects.hashCode(this.item2);
        hash = 79 * hash + Objects.hashCode(this.item3);
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
        final Items other = (Items) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "rifle=" + rifle + ", rifleQuantity=" + rifleQuantity + ", rifleStatus=" + rifleStatus + ", meat=" + meat + ", meatQuantity=" + meatQuantity + ", meatStatus=" + meatStatus + ", bullets=" + bullets + ", bulletsQuantity=" + bulletsQuantity + ", bulletsStatus=" + bulletsStatus + ", map=" + map + ", mapQuantity=" + mapQuantity + ", mapStatus=" + mapStatus + ", extraLife=" + extraLife + ", extraLifeQuantity=" + extraLifeQuantity + ", extraLifeStatus=" + extraLifeStatus + ", knife=" + knife + ", knifeQuantity=" + knifeQuantity + ", knifeStatus=" + knifeStatus + ", item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + '}';
    }

    public Items() {
    }
    

    
    
   
    
    
}

   
