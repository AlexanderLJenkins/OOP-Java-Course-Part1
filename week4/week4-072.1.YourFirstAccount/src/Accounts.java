
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        // Create the account with 100 in the bank
        Account alexAccount = new Account("Alex", 100.0);
        // Deposit 20 in the account
        alexAccount.deposit(20.0);
        System.out.println(alexAccount);
        
        
    }

}
