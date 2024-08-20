package FreeLearn.Sorting;

import java.util.Arrays;

class SelectionSort {
    public static void toSort(int[] data) {
        for(var i = 0; i < data.length; i++) {
            int small = i;
            for(var j = (i + 1); j < data.length; j++) {
                if(data[j] < data[small]) small = j;
            }
            if(data[i] > data[small]) {
                int temp = data[small];
                data[small] = data[i];
                data[i] = temp;
            }
            System.out.println();
        }
    }
}

public class Selection {
    public static void main(String[] args) {
        int[] data = {5, 3, 7, 2, 1};
        System.out.println(Arrays.toString(data) + "\n");
        SelectionSort.toSort(data);
        System.out.println("\n" + Arrays.toString(data));
    }
}
