/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostwhilehunting.model;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Sony
 */
public class SceneQuestions implements Serializable {
     // Class instance variables
    private String fightAnswer;
    private String flightAnswer;
    private String evadeAnswer;
    private double itemReward;
    private String statusUpdate;
    
    private Questions[] questions = new Questions[10];
    
    // The constructor of the class

    public SceneQuestions() {
    }
    

     // Setting getter and setter for each variable. 

    public String getFightAnswer() {
        return fightAnswer;
    }

    public void setFightAnswer(String fightAnswer) {
        this.fightAnswer = fightAnswer;
    }

    public String getFlightAnswer() {
        return flightAnswer;
    }

    public void setFlightAnswer(String flightAnswer) {
        this.flightAnswer = flightAnswer;
    }

    public String getEvadeAnswer() {
        return evadeAnswer;
    }

    public void setEvadeAnswer(String evadeAnswer) {
        this.evadeAnswer = evadeAnswer;
    }

    public double getItemReward() {
        return itemReward;
    }

    public void setItemReward(double itemReward) {
        this.itemReward = itemReward;
    }

    public String getStatusUpdate() {
        return statusUpdate;
    }

    public void setStatusUpdate(String statusUpdate) {
        this.statusUpdate = statusUpdate;
    }

    public Questions[] getQuestions() {
        return questions;
    }

    public void setQuestions(Questions[] questions) {
        this.questions = questions;
    }
   
    
       //Class Hash, Equals, and toString override functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.fightAnswer);
        hash = 47 * hash + Objects.hashCode(this.flightAnswer);
        hash = 47 * hash + Objects.hashCode(this.evadeAnswer);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.itemReward) ^ (Double.doubleToLongBits(this.itemReward) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.statusUpdate);
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
        final SceneQuestions other = (SceneQuestions) obj;
        if (Double.doubleToLongBits(this.itemReward) != Double.doubleToLongBits(other.itemReward)) {
            return false;
        }
        if (!Objects.equals(this.fightAnswer, other.fightAnswer)) {
            return false;
        }
        if (!Objects.equals(this.flightAnswer, other.flightAnswer)) {
            return false;
        }
        if (!Objects.equals(this.evadeAnswer, other.evadeAnswer)) {
            return false;
        }
        if (!Objects.equals(this.statusUpdate, other.statusUpdate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SceneQuestions{" + "fightAnswer=" + fightAnswer + ", flightAnswer=" + flightAnswer + ", evadeAnswer=" + evadeAnswer + ", itemReward=" + itemReward + ", statusUpdate=" + statusUpdate + '}';
    }

    

    
    
}