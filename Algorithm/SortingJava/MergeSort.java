package Algorithm.SortingJava;

import java.util.Arrays;
class Merge {

    public static int[] sort(int[] array) {
        // Driver function
        mergeSort(array, new int[array.length], 0, array.length - 1);
        return array;
    }

    // Call this recursive function
    private static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        // if index left == right, then stop it
        if(leftStart >= rightEnd) return;
        // Divide by 2
        int middle = (leftStart + rightEnd) / 2;
        // Left side
        mergeSort(array, temp, leftStart, middle);
        // Right side
        mergeSort(array, temp, middle + 1, rightEnd);
        // Sorting Left side with Right side
        mergeHalves(array, temp, leftStart, rightEnd);
    }
    
    private static int[] mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        System.out.println("Left start : " + leftStart);
        System.out.println("Right end : " + rightEnd);
        
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightPointer = leftEnd + 1;
        int leftPointer = leftStart;
        int index = leftStart;
        int size = (rightEnd - leftStart) + 1;
        
        System.out.println("Left end : " + leftEnd);
        System.out.println("Right start : " + rightPointer);

        while(leftPointer <= leftEnd && rightPointer <= rightEnd) {
            if(array[leftPointer] <= array[rightPointer]) {
                temp[index] = array[leftPointer];
                leftPointer++;
            } else {
                temp[index] = array[rightPointer];
                rightPointer++;
            }
            index++;
        }
        // System.arraycopy parameter
        // 1. source array
        // 2. source position
        // 3. destination array
        // 4. destination pos
        // 5. length of copy
        System.out.println("\nSource array : " + Arrays.toString(array));
        System.out.println("Source position : " + leftPointer);
        System.out.println("Destination array : " + Arrays.toString(temp));
        System.out.println("Destination position : " + index);
        System.out.println("Length of copy : " + (leftEnd - leftPointer + 1));

        System.out.println("Right pos = " + rightPointer);
        System.out.println("Right end = " + rightEnd);
        System.arraycopy(array, leftPointer, temp, index, (leftEnd - leftPointer) + 1);
        System.arraycopy(array, rightPointer, temp, index, (rightEnd - rightPointer) + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
        
        System.out.println("Temp after sort and merge\t: " + Arrays.toString(temp));
        System.out.println("Array source after sort and merge\t: " + Arrays.toString(array));
        System.out.println("-------------------------------------------\n");

        return array;
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {9, 7, 3, 2, 6, 4, 0, 10, -3};

        Merge.sort(numbers);
    }
}