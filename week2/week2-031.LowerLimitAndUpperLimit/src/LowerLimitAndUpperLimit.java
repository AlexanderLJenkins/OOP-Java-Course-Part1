
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask for two numbers, and print numbers in between
        System.out.print("First: ");
        int lowerNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("First: ");
        int upperNumber = Integer.parseInt(reader.nextLine());
        
        // Print the numbers in between
        int currentNumber = lowerNumber;
        
        while(currentNumber <= upperNumber) {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}
