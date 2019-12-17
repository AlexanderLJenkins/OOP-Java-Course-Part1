
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Check if an inputted year is a leap year
        System.out.print("Type a year: ");
        int inputYear = Integer.parseInt(reader.nextLine());

        if (inputYear % 4 == 0 && inputYear % 100 == 0) {
            if (inputYear % 400 == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }

        } else if (inputYear % 4 == 0) {
            System.out.println("The year is a leap year.");

        } else if (inputYear % 100 == 0) {
            if (inputYear % 400 == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
