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
public enum Actors {
    
    Spinster("Spinster", "", "more Life", ""),
    TopshotYounster("Top-shot Youngster", "", "speed", ""),
    BurlyMan("Burly Man", "", "strength", ""),
    Coyote("coyote", "", "speed", ""),
    Bear("bear", "", "strenght", ""),
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
}