package FreeLearn.Book;

import java.util.Random;

public class Bab6_19 {
    // KPK atau Least Common Multiple
    // Faktor kelipatan yang sama
    /*
        Inisial
        lcm => Least Common Multiple
        gcd => Greatest Common Divisor

        Contoh :
        lcm(52, 48)
        52 => 52, 104, 156, 208, 260, 312, 364, 416, 468, 520, 572, 624, 676
        48 => 48, 96, 144, 192, 240, 288, 336, 384, 432, 480, 528, 576, 624, 672, 720
            lcm(52, 48) => 624

        Formula :
        lcm(x, y) => (x * y) / gcd(x, y)
    */

    public static void main(String[] args) {
        // lcm single test
        int x, y, lcm;
        x = 52;
        y = 48;
        System.out.println("lcm(" + x + ", " + y + ") = " + lcm(x, y));

        // Multi random test
        Random random = new Random();
        for(var i = 0; i < 7; i++) {
            x = Math.round(random.nextFloat() * 100);
            y = Math.round(random.nextFloat() * 100);
            lcm = lcm(x, y);
            System.out.println(
                "lcm(" + x + ", " + y +") = " + lcm + "\t" + lcm + "/" + x + " = " + (lcm/x) + "\t" + lcm + "/" + y + " = " + (lcm/y)
            );
        }
    }

    static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    static int gcd(int x, int y) {
        int max, min, temp;
        max = Math.max(x, y);
        min = Math.min(x, y);

        while(min != 0) {
            temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }
}
