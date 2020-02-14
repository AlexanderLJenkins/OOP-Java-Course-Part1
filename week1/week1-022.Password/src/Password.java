
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        while(true) {
            // Ask the user for the password 
            System.out.print("Type the password: ");
            String inputtedPassword = reader.nextLine();

            // Is it correct?
            if (inputtedPassword.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        
        System.out.println("The secret is: LALALA");
    }
}
