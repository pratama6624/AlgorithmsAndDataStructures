package FreeLearn.Book;

import java.util.Random;

public class Bab6_20 {
    public static void main(String[] args) {
        Random random = new Random();

        float x = random.nextFloat();
        long n = Math.round(1_000_000_000_000L * x);

        // Dari Belakang
        System.out.println("dijit 9 dari " + n + " adalah " + dijit(n, 9));
        System.out.println("dijit 8 dari " + n + " adalah " + dijit(n, 8));
        System.out.println("dijit 7 dari " + n + " adalah " + dijit(n, 7));
        System.out.println("dijit 6 dari " + n + " adalah " + dijit(n, 6));
        System.out.println("dijit 5 dari " + n + " adalah " + dijit(n, 5));
        System.out.println("dijit 4 dari " + n + " adalah " + dijit(n, 4));

        System.out.println();

        double c = 
        83647 / 10;
        System.out.println(c);
    }

    // Urutan dari belakang
    static int dijit(long n, int k) {
        for(var i = 0; i < k; i++) {
            n /= 10;
        }
        System.out.println("n : " + n);
        return (int) n % 10;
    }
}
