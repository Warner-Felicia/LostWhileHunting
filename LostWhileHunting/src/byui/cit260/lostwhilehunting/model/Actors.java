/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;



/**
 *
 * @author Felicia Warner
 */
public enum Actors {
    
    Spinster("Spinster", "", "more Life", ""),
    TopshotYoungster("Top-shot Youngster", "", "speed", ""),
    BurlyMan("Burly Man", "", "strength", ""),
    Coyote("coyote", "", "speed", ""),
    Bear("bear", "", "strength", ""),
    Mugger("mugger", "", "speed", "");    
        
    private String name;
    private String description;
    private String mainStat;
    private String location;
    
    Actors(String name, String description, String mainStat, String location){
        this.name = name;
        this.description = description;
        this.mainStat = mainStat;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMainStat() {
        return mainStat;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Actors{" + "name=" + name + ", description=" + description + ", mainStat=" + mainStat + ", location=" + location + '}';
    }

    
    
}