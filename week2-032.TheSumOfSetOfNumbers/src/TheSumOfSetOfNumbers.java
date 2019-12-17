
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        
        int iteration = 0;
        int sum = 0;
        while(iteration <= upperLimit) {
            sum += iteration;
            iteration++;
        }
        System.out.println("Sum is " + sum);
    }
}
