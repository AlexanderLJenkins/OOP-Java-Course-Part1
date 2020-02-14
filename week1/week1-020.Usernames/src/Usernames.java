
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Take user login information and verify it
        System.out.print("Type your username: ");
        String inputUsername = reader.nextLine();
        
        System.out.print("Type your password: ");
        String inputPassword = reader.nextLine();
        
        // Check credidentials
        if (inputUsername.equals("alex") && inputPassword.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else if (inputUsername.equals("emily") && inputPassword.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
