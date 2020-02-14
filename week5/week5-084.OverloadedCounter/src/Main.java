public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        Counter counter = new Counter(-5, true);
        int counterValue = counter.value();
        System.out.println(counterValue);
        
        counter = new Counter(-5, false);
        counterValue = counter.value();
        System.out.println(counterValue);
        
        counter = new Counter(-5);
        counterValue = counter.value();
        System.out.println(counterValue);
        
        counter = new Counter(false);
        counterValue = counter.value();
        System.out.println(counterValue);
        
        counter = new Counter(true);
        counterValue = counter.value();
        System.out.println(counterValue);
        
    }
}
