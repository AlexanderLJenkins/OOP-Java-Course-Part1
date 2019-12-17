import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char firstCharOfName = firstCharacter(name);
        System.out.println("First character: " + firstCharOfName);
        
    }
    
    public static char firstCharacter(String word) {
        return word.charAt(0);
    }
}
