
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        // creates a copy of the parameter
        int[] arrayCopy = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        
        return arrayCopy;
    }
    
    public static int[] reverseCopy(int[] array) {
        // creates a reversed copy of the parameter
        
        int[] reverseArrayCopy = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            reverseArrayCopy[i] = array[(array.length - 1) - i];
        }
        
        return reverseArrayCopy;
        
    }
    
}
