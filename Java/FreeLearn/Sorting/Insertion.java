package FreeLearn.Sorting;

import java.util.Arrays;

class InsertionSort {
    public static void toSort(int[] data) {
        System.out.println("====================");
        for(var i = 0; i < (data.length - 1); i++) {
            for(var j = (i + 1); j > 0; j--) {
                // System.out.print(j + " " + (j - 1) + ", ");
                if(data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
                System.out.println(Arrays.toString(data));
            }
            System.out.println();
        }
        System.out.println("====================");
    }
}

public class Insertion {
    public static void main(String[] args) {
        int[] data = {8, 3, 5, 1, 4};
        System.out.println(Arrays.toString(data) + "\n");
        InsertionSort.toSort(data);
        System.out.println("\n" + Arrays.toString(data));
    }
}
