
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        int character = 0;
        while (character < name.length()) {
            System.out.println((character+1) + ". character: " + name.charAt(character));
            character++;
        }
    }
}
