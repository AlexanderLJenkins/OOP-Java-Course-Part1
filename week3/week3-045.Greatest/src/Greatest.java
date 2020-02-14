
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // Return the greatest of the parameters
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(1, 2, 3);
        System.out.println("Greatest: " + result);
    }
}
