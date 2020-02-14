
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Ask the user for the points
        System.out.print("Type the points [0-60]: ");
        int userPoints = Integer.parseInt(reader.nextLine());
        
        // Print the grade
        if (userPoints <= 29) {
            System.out.println("\nGrade: failed");
        } else if (userPoints <= 34) {
            System.out.println("\nGrade: 1");
        } else if (userPoints <= 39) {
            System.out.println("\nGrade: 2");
        } else if (userPoints <= 44) {
            System.out.println("\nGrade: 3");
        } else if (userPoints <= 49) {
            System.out.println("\nGrade: 4");
        } else if (userPoints <= 60) {
            System.out.println("\nGrade: 5");
        }
        
    }
}
