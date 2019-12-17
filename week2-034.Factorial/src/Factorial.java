import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Calculate the factorial of a user specified number
        System.out.print("Type a number: ");
        int userNumber = Integer.parseInt(reader.nextLine());
        
        int helperNumber = userNumber;
        int factorial = 1;
        
        while(helperNumber > 0) {
            factorial *= helperNumber;
            helperNumber--;
        }
        
        System.out.println("Factorial is " + factorial);
        
    }
}
