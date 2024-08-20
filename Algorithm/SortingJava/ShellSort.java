package Algorithm.SortingJava;

import java.util.Arrays;

class Shell {
    public void sort(int[] dataSource) {
        int len = dataSource.length;

        for(var gap = len /2; gap > 0; gap /= 2) {
            System.out.println("Gap : " + gap);
            for(var i = gap; i < len; i++) {
                int val = dataSource[i];
                int k = i;
                System.out.println("k : " + k + " \tval : " + val);

                System.out.println("\nk before while : " + k);

                while(k >= gap && dataSource[k - gap] > val) {
                    dataSource[k] = dataSource[k - gap];
                    k -= gap;
                }

                System.out.println("k after while : " + k);

                dataSource[k] = val;
                System.out.println("result : " + Arrays.toString(dataSource) + "\n");
            }
            System.out.println();
        }

        // System.out.println("result : " + Arrays.toString(dataSource));
    }
}

public class ShellSort {
    public static void main(String[] args) {
        // int[] numbers = {35, 33, 42, 10, 14, 19, 27, 44};
        int[] numbers = {40, 2, 1, 43, 3, 65, 0, -1, 58, 3, 42, 4};
        Shell shell = new Shell();
        shell.sort(numbers);
    }
}