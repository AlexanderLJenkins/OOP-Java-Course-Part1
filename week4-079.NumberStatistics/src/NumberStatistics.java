public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        // Default constructor
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        // Add a number to the stats
        this.amountOfNumbers++;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        // Tells us how many numbers have been added to stats
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (amountOfNumbers != 0) {
            return (double) sum()/amountOfNumbers();
        } else {
            return 0;
        }
            
        
    }
}
