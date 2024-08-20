package Algorithm.SortingJava;

import java.util.Arrays;

class Insertion {
    public static void InsertionSortAlgo(int[] array) {
        for(var i = 0; i < array.length - 1; i++) {
            System.out.print("Loop " + (i + 1) + "\t: ");
            for(var j = i; j >= 0; j--) {
                System.out.print((j + 1) + " " + j + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] toSort(int[] array) {
        System.out.println("Original Array\t: " + Arrays.toString(array) + "\n");
        for(var i = 0; i < array.length - 1; i++) {
            for(var j = i; j >= 0; j--) {
                if(array[j] > array[j + 1]) {
                    System.out.println(
                        "Inner loop\t: Compare (n + 1) < n : " + (array[j + 1]) + " < " + array[j]
                        + (array[j] > array[j + 1] ? "\t=> swap" : "")
                    );
                }
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
            System.out.println("\n");
            // System.out.println("\n" + Arrays.toString(array) + "\n");
        }
        System.out.println();

        return array;
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        // int[] numbers = {1, 9, 2, 5, 7, 4, 3, 6, 10, -18};
        // int[] numbers = {40, 2, 1, 43, 4, 65, 0, -1, 58, 3, 42, 4};
        // int[] numbers = {2, 0, -1, 3, 1, 4, 40, 3, 42, 43, 65, 58};
        // int[] numbers = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        // int[] numbers = {35, 33, 42, 10, 14, 19, 27, 44};
        int[] numbers = {14, 19, 27, 10, 35, 33, 42, 44};

        // Insertion.InsertionSortAlgo(numbers);
        Insertion.toSort(numbers);
    }
}