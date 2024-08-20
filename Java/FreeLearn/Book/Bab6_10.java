package FreeLearn.Book;

import java.util.Random;

public class Bab6_10 {
    // Java overloading method
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

            System.out.println("maks(" + a + ", " + b + ", " + c + ", " + d + ") = " + maks(a, b, c, d));
        }

        System.out.println();

        System.out.println(maks(9, 44));
        System.out.println(maks(10, 21, 8));
    }

    static int maks(int a, int b) {
        System.out.println("func 1");
        if(a > b) return a;
        return b;
    }

    static int maks(int a, int b, int c) {
        System.out.println("func 2");
        return maks(maks(a, b), c);
    }

    static int maks(int a, int b, int c, int d) {
        System.out.println("func 3");
        return maks(maks(maks(a, b), c), d);
    }
}
