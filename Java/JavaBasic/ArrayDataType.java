package JavaBasic;

public class ArrayDataType {
    public static void main(String[] args) {
        // Array is a collection of data of the same type
        
        // how to make an array 1
        int[] dataInt = new int[3];
        dataInt[0] = 10;
        dataInt[1] = 15;
        dataInt[2] = 20;

        for(var value : dataInt) {
            System.out.println("value\t: " + value);
        }

        // how to make an array 2
        String[] dataString = {"Pratama", "Nur", "Dea"};

        System.out.println("\ndata String 1 : " + dataString[1] + "\n");

        // How to make an array 3
        double[] dataDouble;
        dataDouble = new double[2];

        dataDouble[1] = 1.0;
        dataDouble[0] = 2.0;

        for(var value : dataDouble) {
            System.out.println("value\t: " + value);
        }

        // How to make an array 4
        long[] dataLong = new long[]{
            10L, 20L, 1_111L, 201_212L
        };

        System.out.println();
        for(var value : dataLong) {
            System.out.println("value\t: " + value);
        }

        // 2D array
        // Array within Array
        // Matrix 4 X 4
        int[][] dataInt2D = new int[][] {
            {1, 2, 3, 4},
            {5, 7, 8, 9},
            {4, 3, 2, 1},
            {9, 8, 7, 6}
        };

        System.out.println("\nData int 2D [3][3] : " + dataInt2D[3][3] + "\n");

        for(var i = 0; i < 4; i++) {
            for(var j = 0; j < 4; j++) {
                System.out.print(i + " " + j + " => " + dataInt2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
