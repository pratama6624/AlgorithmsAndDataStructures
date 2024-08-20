package FreeLearn.Book;

import java.util.Random;

public class Bab6_12 {
    public static void main(String[] args) {
        Random random = new Random();

        for(var i = 0; i < 10; i++) {
            float x = random.nextFloat();
            int a = Math.round(100 * x);
            x = random.nextFloat();
            int b = Math.round(100 * x);

            System.out.println("maks(" + a + ", " + b + ") = " + findMaks(a, b));
        }
    }

    static int findMaks(int a, int b) {
        if(a > b) return a;
        return b;
    }
}
