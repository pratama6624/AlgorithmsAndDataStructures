package FreeLearn.Book;

import java.util.Random;

public class Bab6_18 {
    public static void main(String[] args) {
        // Find Greatest Common Divisor
        /*
            Formula => gcd(60, 36)
                60 mod 36 => 24
                36 mod 24 => 12
                24 mod 12 => 0
                    gcd => 12
                    stop the loop if mod divisor equals 0
        */

        /*
            Formula 2 => gcd(60, 36)
                Posisi nilai max harus didepan
                60 - 36 => 24   Loop 1
                24 - 36 => -12
        */

        Random random = new Random();

        for(var i = 0; i < 10; i++) {
            float x = random.nextFloat();
            int a = Math.round(x * 100);
            x = random.nextFloat();
            int b = Math.round(x * 100);

            System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a,b));
            System.out.println("gcdFromBook(" + a + ", " + b + ") = " + gcdFromBook(a,b));
        }

        int a = 516;
        int b = 1220;
        System.out.println("\ngcd(" + a + ", " + b + ") = " + gcd(a,b) + "\n\n");
        System.out.println("\ngcd(" + a + ", " + b + ") = " + gcdFromBook(a,b));
    }

    // My Formula
    static int gcd(int x, int y) {
        int max, min, temp, count;
        max = Math.max(x, y);
        min = Math.min(x, y);
        count = 1;

        while(min != 0) {
            temp = max % min;
            // temp = 24
            max = min;
            // max = 36
            min = temp;
            // min = 24
            System.out.println(
                "Loop " + (count++) + "\t " + "x(" + max + ") % y(" + min + ") => " + temp +
                (min == 0 ? "   Stop" : "")
            );
        }

        return max;
    }

    static int gcdFromBook(int x, int y) {
        int count = 1;
        while(x > 0) {
            if(x < y) {
                int temp = x;
                x = y;
                y = temp;
            }
            x -= y;
            System.out.println(
                "Loop " + (count++) + "\t " + "x(" + x + ") - y(" + y + ") => " + x +
                (x < 1 ? "   Stop" : "")
            );
        }
        return y;
    }
}
