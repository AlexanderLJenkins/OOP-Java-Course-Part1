public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        
        while (beginning <= end) {
            int middle = (beginning + end) / 2;
                            
            if (array[middle] == searchedValue) {
                return true;
            } else if (array.length == 1) {
                break;
            }
                    
            if (beginning == end && array[middle + 1] == searchedValue) {
                return true;
            }
              
            if (beginning == end) {
                break;
            }
            
            if (array[middle] < searchedValue) {
                beginning = middle + 1;
            } else {
                end = middle;
            }
            
        }
        return false;
    }
}
