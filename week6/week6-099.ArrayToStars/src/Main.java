
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // print a line of stars for each number in the array
        
        // loop over each number in the array 
        for (int numberOfStars : array) {
        
            // print each star
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }        
    }
}
