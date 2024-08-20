package FreeLearn.Sorting;

import java.util.Arrays;

class BubbleSort {
    public static void toSort(int[] data) {
        for(var i = data.length - 1; i > 0; i--) {
            for(var j = 0; j < i; j++) {
                if(data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                System.out.println("Step\t: " + Arrays.toString(data));
            }
            System.out.println();
        }
    }
}

public class Bubble {
    public static void main(String[] args) {
        // int[] data = {10, 8, 7, 5, 4, 2, 1, -2, 0, 3};
        int[] data = {5, 3, 7, 2, 1};
        System.out.println(Arrays.toString(data) + "\n");
        BubbleSort.toSort(data);
        System.out.println("\n" + Arrays.toString(data) + "\n");
    }
}
