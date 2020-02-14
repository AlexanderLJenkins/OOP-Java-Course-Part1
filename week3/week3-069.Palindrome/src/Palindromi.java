import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        
        boolean isPalindrome = text.equals(reverse(text));
        return isPalindrome;
    }

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int i = text.length() - 1;
        char character;
        String reversedText = "";
        while (i >= 0) {
            character = text.charAt(i);
            reversedText = reversedText + character;
            i--;
        }
        return reversedText;
    }
        
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
