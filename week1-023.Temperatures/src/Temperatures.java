
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        
        // Define the temperature
        double temperature;
        String optionFinished;
        
        while(true) {
            // Ask the user to input a temperature to the graph
            System.out.print("Give a temperature: ");
            temperature = Double.parseDouble(reader.nextLine());
            
            // Check the temperature is real
            if (temperature < -30 || temperature > 40) {
                System.out.println("Wrong!");
            } else {
                
                System.out.println("Right!");
                
                // Add to the graph
                Graph.addNumber(temperature);

                // Check if the user is done
                System.out.print("Are you finished (y/n): ");
                optionFinished = reader.nextLine();

                if (optionFinished.equals("y")) {
                    break;
                } 
            }
        }
    }
}
