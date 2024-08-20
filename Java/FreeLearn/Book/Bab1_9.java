package FreeLearn.Book;

import java.util.Arrays;

public class Bab1_9 {
    public static void main(String[] args) {
        int[][] arr2D = new int[4][5];
        int i, j, k = 0;

        for(i = 0; i < 4; i++) {
            for(j = 0; j < 5; j++) {
                arr2D[i][j] = k++;
                System.out.print(i + " " + j + ", ");
            }
            System.out.println();
        }

        System.out.println("\n" + Arrays.deepToString(arr2D));
    }
}
