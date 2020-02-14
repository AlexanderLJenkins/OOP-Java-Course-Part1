
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        
        // Ask for the radius
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());
        
        // Calculate the circle's circumference
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        System.out.println("\nCircumference of the circle: " + circumference);
    }
}
