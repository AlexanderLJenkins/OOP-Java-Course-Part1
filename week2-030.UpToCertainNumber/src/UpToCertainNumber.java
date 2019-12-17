
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Print whole numbers up to a certain number
        
        // Get the top number from the user
        System.out.print("Type your upper number to print to: ");
        int upperNumber = Integer.parseInt(reader.nextLine());
        
        // Print all numbers from 1 to upper number
        int currentNumber = 1;
        
        while(currentNumber <= upperNumber) {
            System.out.println(currentNumber);
            currentNumber++;
        }
        
    }
}
