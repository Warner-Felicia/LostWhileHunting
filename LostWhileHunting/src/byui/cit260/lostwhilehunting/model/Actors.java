/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.awt.Point;
import java.io.Serializable;



/**
 *
 * @author Felicia Warner
 */
public enum Actors implements Serializable{
    
    Spinster("Sue", "A sweet lady very good at hunting with traps.", "health", 
        new Point(0,0)),
    TopshotYoungster("Timmy", "A young teen taught by his father how to shoot "
            + "from a distance.", "speed", new Point(0,0)),
    BurlyMan("Burly Man", "A super strong farmer, known to have won many fights.", 
            "strength", new Point(0,0)),
    Coyote("coyote", "A hungry dog like animal who makes a lot of noise.", 
            "speed", new Point(0,1)),
    Wolf("wolf", "Leader of the wolf pack, if he is killed they all disburse.",
        "speed", new Point(3,1)),
    SmallWolf("pups", "Wolves that follow the Alpha.", "speed", new Point(5,1)),
    Bear("bear", "A huge bear who is often seen by the great river catching salmon.",
        "strength", new Point(7,1)),
    Thieves("muggers", "Men who have no regard for property.", "health", 
        new Point(7,2));
    
        
    private String name;
    private String description;
    private String mainStat;
    private Point location;
    
    Actors(String name, String description, String mainStat, Point location){
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

    public Point getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Actors{" + "name=" + name + ", description=" + description + ", mainStat=" + mainStat + ", location=" + location + '}';
    }

    
    
}