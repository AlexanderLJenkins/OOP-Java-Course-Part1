
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        // Get the first number from the user
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        // Get the second number from the user
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        // Print the largest of the two numbers
        int largestInteger = Math.max(firstNumber, secondNumber);
        
        System.out.println("\nThe bigger number of the two numbers given was: " + largestInteger);
                
        
    }
}
