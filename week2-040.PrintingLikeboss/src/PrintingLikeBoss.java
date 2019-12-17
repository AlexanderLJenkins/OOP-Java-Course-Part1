public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        while(amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        
        int layerWidth = 1;
        while(layerWidth <= size) {
            printWhitespaces(size-layerWidth);
            printStars(layerWidth);
            layerWidth++;
        }

    }

    public static void xmasTree(int height) {
        // 40.3
        int layerStars = 1;
        int layerWhite = height - layerStars;
        while(layerWhite >= 0) {
            
            printWhitespaces(layerWhite);
            printStars(layerStars);
            layerStars += 2;
            layerWhite--;
        }
        
        
        printWhitespaces(height - 2);
        printStars(3);
        
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
