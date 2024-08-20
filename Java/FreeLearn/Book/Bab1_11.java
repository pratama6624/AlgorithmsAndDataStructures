package FreeLearn.Book;

import java.util.Arrays;

public class Bab1_11 {
    public static void main(String[] args) {
        int[][][] arr3D = new int[3][4][5];
        int i, j, k = 0;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 4; j++) {
                for(k = 0; k < 5; k++) {
                    arr3D[i][j][k] = i * j * k;
                    System.out.print(i + " " + j + " " + k + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("\n" + Arrays.deepToString(arr3D));
    }
}
