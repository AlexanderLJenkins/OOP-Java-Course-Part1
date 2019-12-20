/*
A selection sorting algorithm
*/

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
        // indexes:    0  1  2  3   4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        
    }
    
    public static void sort(int[] array) {
        // Selection sorting 
        
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static int smallest(int[] array) {
        // Return the smallest value in an array
        
        int value = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
            }
        }
        
        return value;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        
        int index = 0;
        int value = array[index];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int value = array[index];
        
        for (int i = index; i < array.length; i++) {
            if (array[i] < value) {
                value = array[i];
                index = i;
            }
        }
        
        return index;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int valueAtIndex1 = array[index1];
        int valueAtIndex2 = array[index2];
        
        array[index1] = valueAtIndex2;
        array[index2] = valueAtIndex1;
        
    }
    
}
