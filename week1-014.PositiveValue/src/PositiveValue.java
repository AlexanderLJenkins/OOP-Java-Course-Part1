
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        
        // Get the first number
        System.out.print("Type a number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());
        
        // Check the sign of the number
        if (firstNumber > 0) {
            System.out.println("\nThe number is positive.");
        } else {
            System.out.println("\nThe number is not positive.");
        }
       
    }
}
