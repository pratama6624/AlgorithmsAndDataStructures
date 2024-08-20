package Algorithm.SortingJava;

import java.util.Arrays;

class Bubble {
    public static void bubbleSortAlgo(int[] array) {
        for(var i = 1; i < array.length; i++) {
            System.out.print("Loop " + i + " : ");
            for(var j = 0; j < (array.length - i); j++) {
                System.out.print(j + " " + (j + 1) + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] toSort(int[] array) {
        System.out.println("Original Array\t: " + Arrays.toString(array) + "\n");

        for(var i = 1; i < array.length; i++) {
            for(var j = 0; j < (array.length - i); j++) {
                System.out.println(
                    "Inner loop " + (j + 1) + "\t: Compare n > (n + 1) : " + array[j] + " > " + array[j + 1]
                    + (array[j] > array[j + 1] ? "\t=> swap" : "")
                );
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("\nStep " +  i + "\t: " + Arrays.toString(array) + "\n");
        }
        return array;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        // int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -18};
        int[] numbers = {7, 9, 3, 2, 6, 4, 0, 10, -3};

        // Bubble.bubbleSortAlgo(numbers);
        Bubble.toSort(numbers); // int[]
        System.out.println();
    }
}
