
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        birdObservations birdDatabase = new birdObservations();
        
        // Bird watching menu
        while(true) {
            
            System.out.print("? ");
            String option = reader.nextLine().toUpperCase().trim();
            
            if (option.equals("QUIT")) {
                break;
            }
            
            if (option.equals("ADD")) {
                birdDatabase.addBird(reader);
            }
            
            if (option.equals("OBSERVATION")) {
                birdDatabase.observation(reader);
            }
            
            if (option.equals("STATISTICS")) {
                birdDatabase.statistics();
            }
            
            if (option.equals("SHOW")) {
                birdDatabase.show(reader);
            }
        }
    }
}