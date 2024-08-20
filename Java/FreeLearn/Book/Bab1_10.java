package FreeLearn.Book;

import java.util.Arrays;

public class Bab1_10 {
    public static void main(String[] args) {
        int[][] arr2D = new int[4][];
        int i, j, k = 0;

        for(i = 0; i < 4; i++) {
            arr2D[i] = new int[i + 1];
            for(j = 0; j <= i; j++) {
                arr2D[i][j] = k++;
                System.out.print(arr2D[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n" + Arrays.deepToString(arr2D));
    }
}