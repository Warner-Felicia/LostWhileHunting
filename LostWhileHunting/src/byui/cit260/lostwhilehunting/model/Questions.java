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
 * @author Fiorald Ismaili
 */
public class Questions implements Serializable  {
    
    // Questions class instance variables
    private String question;
    private String answer;

    public Questions() {
    }
    
    

    // Setting getter and setter for each variable. 

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    
    //Class Hash, Equals, and toString override functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.question);
        hash = 37 * hash + Objects.hashCode(this.answer);
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
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", answer=" + answer + '}';
    }

    
    
}
