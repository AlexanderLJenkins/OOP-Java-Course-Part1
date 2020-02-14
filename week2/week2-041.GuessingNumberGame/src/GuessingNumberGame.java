
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int numberOfGuesses;
        int guessedNumber = 101;
        int guesses = 0;
        
        while(guessedNumber != numberDrawn) {
            System.out.print("Guess a number: ");
            guessedNumber = Integer.parseInt(reader.nextLine());
            guesses++;
            
            if(guessedNumber == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
            } else if(guessedNumber > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
