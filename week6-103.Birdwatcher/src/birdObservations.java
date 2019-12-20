
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Jenkins
 */
public class birdObservations {
    
    private ArrayList<Bird> birdList;
    
    public birdObservations() {
        birdList = new ArrayList<Bird>();
    }
    
    public void addBird(Scanner reader) {
        // Add from user input
        
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        
        birdList.add(new Bird(name, latinName));
    }
    
    public void observation(Scanner reader) {
        
        System.out.print("What was observed:? ");
        String observedBirdName = reader.nextLine();
        
        for (Bird bird : birdList) {
            
            if (isBird(bird.getName(), observedBirdName)) {
                bird.addObservation();
                return;
            }
        }
        
        System.out.println("Is not a bird!");
    }
    
    private boolean isBird(String birdName, String observedBirdName) {
        
        observedBirdName = observedBirdName.toUpperCase();
        observedBirdName = observedBirdName.trim();
        birdName = birdName.toUpperCase();
        birdName = birdName.trim();
        
        return birdName.equals(observedBirdName);
    }
    
    public void statistics() {
        // Print all birds
        // Order the birdList by observations
        
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }
    
    public void show(Scanner reader) {
        
        System.out.println("What? ");
        String showBird = reader.nextLine();
        
        for (Bird bird : birdList) {
            
            if (isBird(bird.getName(), showBird)) {
                System.out.println(bird);
            } else {
                System.out.println("Is not a bird!");
            }
        }
        
    }
    
    
}
