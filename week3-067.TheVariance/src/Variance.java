import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // Calculate the square of the items in list
        double sum = 0;
        double average = average(list);
        for (int item : list) {
            sum += Math.pow((item - average), 2);
        }
        return (sum/(list.size()-1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
