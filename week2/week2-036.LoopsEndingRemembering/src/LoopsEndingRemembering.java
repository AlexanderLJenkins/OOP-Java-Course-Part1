import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        
        // Definition of variables
        int userNumber;
        int sumOfNumbers = 0;
        int numbersTyped = 0;
        double average = 0;
        int evenTyped = 0;
        int oddTyped = 0;
        
        // Reading numbers and calculations
        System.out.println("Type numbers: ");
        while(true) {
            userNumber = Integer.parseInt(reader.nextLine());
            
            // End the loop
            if(userNumber == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sumOfNumbers);
                System.out.println("How many numbers: " + numbersTyped);
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + evenTyped);
                System.out.println("Odd numbers: " + oddTyped);
                break;
            }
            
            // Calculations
            sumOfNumbers += userNumber;
            numbersTyped++;
            average = ((double)sumOfNumbers/numbersTyped);
            
            // Calculate the number of odd and even numbers typed
            if(userNumber%2 == 0) {
                evenTyped++;
            } else {
                oddTyped++;
            }
            
        }
        
    }
}
