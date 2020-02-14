import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Get the first number
        System.out.print("Type the first number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());
        
        // Get the second number
        System.out.print("Type the second number: ");
        double secondNumber = Double.parseDouble(reader.nextLine());
        
        // Find the greater number
        double largestNumber = Math.max(firstNumber, secondNumber);
        
        if (firstNumber - secondNumber == 0) {
            System.out.println("\nThe numbers are equal!");
        } else {
            System.out.println("\nGreater number: " + largestNumber);
        }
        
    }
}
