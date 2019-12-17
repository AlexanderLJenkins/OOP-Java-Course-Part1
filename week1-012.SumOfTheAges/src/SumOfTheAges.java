
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        
        // Get names and ages of two users
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.print("\nType your name: ");
        String secondName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        // Print the results string
        String summaryString = firstName + " and " + secondName + " are " + (firstAge + secondAge) + " years old in total."; 
        System.out.println("\n" + summaryString);
        
    }
}
