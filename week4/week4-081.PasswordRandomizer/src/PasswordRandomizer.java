import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    
    // Define the variables
    private int passwordLength;
    private Random random;
    
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
        this.random = new Random();
    }
    

    public String createPassword() {
        // write code that returns a randomized password
       
        int numberInPassword = 0;
        String password = "";
        
        while (true) {
            
            if (numberInPassword == this.passwordLength) {
                break;
            }
            
            // Append random character to password
            int randomNumber = this.random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomNumber);
            password += "" + symbol;
            numberInPassword++;
        }
        
        return password;
    }
}
