
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        
        // Get the first number
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        // Get the second number
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        // Take the quotient
        double quotient = (double)firstNumber / (double)secondNumber;
        
        // Print the results
        String resultsLine = firstNumber + " / " + secondNumber + " = " + quotient;
        System.out.println("\nDivision: " + resultsLine);
    }
}
