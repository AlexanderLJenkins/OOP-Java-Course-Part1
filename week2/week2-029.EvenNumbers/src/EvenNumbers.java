
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        
        // Print all even numbers beteen 2 and 100
        
        int currentNumber = 2;
        
        while(currentNumber <= 100) {
            if(currentNumber%2 == 0) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
             
    }
}
