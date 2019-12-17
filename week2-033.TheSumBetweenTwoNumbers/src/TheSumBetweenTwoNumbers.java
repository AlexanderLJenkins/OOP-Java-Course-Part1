
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Calculate the sum between two numbers
        System.out.print("First: ");
        int lowerNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        int upperNumber = Integer.parseInt(reader.nextLine());
        
        int betweenNumber = lowerNumber;
        int sum = 0;
        
        while(betweenNumber <= upperNumber) {
            sum += betweenNumber;
            betweenNumber++;
        }
        System.out.println("The sum is " + sum);
    }
}
