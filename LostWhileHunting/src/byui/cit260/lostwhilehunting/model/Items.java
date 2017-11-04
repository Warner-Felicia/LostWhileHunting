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
public final class Items {
    
       
     
    private static String rifle = "Rifle";
    private static int rifleQuantity = 0;
    private static String rifleStatus = "";
    
    private static String meat = "Meat";
    private static int meatQuantity = 0;
    private static String meatStatus = "";
    
    private static String bullets = "Bullets";
    private static int bulletsQuantity = 0;
    private static String bulletsStatus = "";
    
    private static String map = "Map";
    private static int mapQuantity = 0;
    private static String mapStatus = "";
    
    private static String extraLife = "ExtraLife";
    private static int extraLifeQuantity = 0;
    private static String extraLifeStatus = "";
    
    private static String knife = "Knife";
    private static int knifeQuantity = 0;
    private static String knifeStatus = "";
    
    private static String item1 = "";
    private static String item2 = "";
    private static String item3 = "";

    public static String getRifle() {
        return rifle;
    }

    public static void setRifle(String rifle) {
        Items.rifle = rifle;
    }

    public static int getRifleQuantity() {
        return rifleQuantity;
    }

    public static void setRifleQuantity(int rifleQuantity) {
        Items.rifleQuantity = rifleQuantity;
    }

    public static String getRifleStatus() {
        return rifleStatus;
    }

    public static void setRifleStatus(String rifleStatus) {
        Items.rifleStatus = rifleStatus;
    }

    public static String getMeat() {
        return meat;
    }

    public static void setMeat(String meat) {
        Items.meat = meat;
    }

    public static int getMeatQuantity() {
        return meatQuantity;
    }

    public static void setMeatQuantity(int meatQuantity) {
        Items.meatQuantity = meatQuantity;
    }

    public static String getMeatStatus() {
        return meatStatus;
    }

    public static void setMeatStatus(String meatStatus) {
        Items.meatStatus = meatStatus;
    }

    public static String getBullets() {
        return bullets;
    }

    public static void setBullets(String bullets) {
        Items.bullets = bullets;
    }

    public static int getBulletsQuantity() {
        return bulletsQuantity;
    }

    public static void setBulletsQuantity(int bulletsQuantity) {
        Items.bulletsQuantity = bulletsQuantity;
    }

    public static String getBulletsStatus() {
        return bulletsStatus;
    }

    public static void setBulletsStatus(String bulletsStatus) {
        Items.bulletsStatus = bulletsStatus;
    }

    public static String getMap() {
        return map;
    }

    public static void setMap(String map) {
        Items.map = map;
    }

    public static int getMapQuantity() {
        return mapQuantity;
    }

    public static void setMapQuantity(int mapQuantity) {
        Items.mapQuantity = mapQuantity;
    }

    public static String getMapStatus() {
        return mapStatus;
    }

    public static void setMapStatus(String mapStatus) {
        Items.mapStatus = mapStatus;
    }

    public static String getExtraLife() {
        return extraLife;
    }

    public static void setExtraLife(String extraLife) {
        Items.extraLife = extraLife;
    }

    public static int getExtraLifeQuantity() {
        return extraLifeQuantity;
    }

    public static void setExtraLifeQuantity(int extraLifeQuantity) {
        Items.extraLifeQuantity = extraLifeQuantity;
    }

    public static String getExtraLifeStatus() {
        return extraLifeStatus;
    }

    public static void setExtraLifeStatus(String extraLifeStatus) {
        Items.extraLifeStatus = extraLifeStatus;
    }

    public static String getKnife() {
        return knife;
    }

    public static void setKnife(String knife) {
        Items.knife = knife;
    }

    public static int getKnifeQuantity() {
        return knifeQuantity;
    }

    public static void setKnifeQuantity(int knifeQuantity) {
        Items.knifeQuantity = knifeQuantity;
    }

    public static String getKnifeStatus() {
        return knifeStatus;
    }

    public static void setKnifeStatus(String knifeStatus) {
        Items.knifeStatus = knifeStatus;
    }

    public static String getItem1() {
        return item1;
    }

    public static void setItem1(String item1) {
        Items.item1 = item1;
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

   
