package FreeLearn.Book;

import java.util.Random;

public class Bab6_13b {
    public static void main(String[] args) {
        Random random = new Random();

        for(var i = 0; i < 10; i++) {
            float x = random.nextFloat();
            int a = Math.round(100 * x);
            x = random.nextFloat();
            int b = Math.round(100 * x);
            x = random.nextFloat();
            int c = Math.round(100 * x);
            x = random.nextFloat();
            int d = Math.round(100 * x);

            System.out.println("min(" + a + ", " + b + ", " + c + ", " + d + ") = " + findMin(a, b, c, d));
        }
    }

    static int findMin(int a, int b, int c, int d) {
        int temp = a;
        if(b < temp) temp = b;
        if(c < temp) temp = c;
        if(d < temp) temp = d;
        return temp;
    }
}
