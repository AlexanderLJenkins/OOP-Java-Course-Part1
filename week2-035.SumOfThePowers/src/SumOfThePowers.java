
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Calculate the sum of the powers of a user-specified number
        
        System.out.print("Type a number: ");
        int tempPower = Integer.parseInt(reader.nextLine());
        
        int sumOfPowers = 0;
        while(tempPower >= 0) {
            sumOfPowers += (int)Math.pow(2, tempPower);
            tempPower--;
        }
        
        System.out.println("The result is " + sumOfPowers);
                
                
    }
}
