import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    
    private ArrayList<Integer> numbers;
    private Random random;
    private final int amountNumbers = 7;
    private final int upperNumber = 39;
            
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()

        while (true) {
            
            if (this.numbers.size() == this.amountNumbers) {
                break; // finished drawing numbers
            }
            
            // Draw the number without replacement
            int drawnNumber = this.random.nextInt(this.upperNumber) + 1;
            if (!containsNumber(drawnNumber)) {
                this.numbers.add(drawnNumber);
            }
        }
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
