/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class for a bird, includes their name and Latin name
 * 
 * @author Alex Jenkins
 */

public class Bird {
    
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        observations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }
    
    public int getObservations() {
        return observations;
    }
    
    public void addObservation() {
        observations++;
    }

    @Override
    public String toString() {
        return getName() + " (" + getLatinName() + "): " + getObservations() + " observations";
    }
    
}
