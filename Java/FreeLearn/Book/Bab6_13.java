package FreeLearn.Book;

import java.util.Random;

public class Bab6_13 {
    public static void main(String[] args) {
        Random random = new Random();

        for(var i = 0; i < 10; i++) {
            float x = random.nextFloat();
            int a = Math.round(100 * x);
            x = random.nextFloat();
            int b = Math.round(100 * x);
            x = random.nextFloat();
            int c = Math.round(100 * x);

            System.out.println("maks(" + a + ", " + b + ", " + c + ") = " + findMaks(a, b, c));
        }
    }

    static int findMaks(int a, int b, int c) {
        int temp = a; // temp digunakan sebagai pembanding
        if(b > temp) temp = b;
        if(c > temp) temp = c;
        return temp;
    }
}
