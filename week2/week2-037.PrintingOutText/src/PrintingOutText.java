import java.util.Scanner;

public class PrintingOutText {

    public static void printText() {
        // Write your code here
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How many? ");
        int numberOfTimes = Integer.parseInt(reader.nextLine());
        while(numberOfTimes > 0) {
            printText();
            numberOfTimes--;
        }
        
    }
}
