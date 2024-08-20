package FreeLearn.Book;

import java.util.Random;

public class Bab6_2 {
    // Find small
    public static void main(String[] args) {
        Random random = new Random();
        
        for(var i = 0; i < 5; i++) {
            Float x = random.nextFloat();
            int m = Math.round(100 * x);
            x = random.nextFloat();
            int n = Math.round(100 * x);

            int y = findMin(m, n);

            System.out.println("min(" + m + ", " + n + ") = " + y);
        }
    }

    static int findMin(int m, int n) {
        if(m > n) return n;
        return m;
    }
}
