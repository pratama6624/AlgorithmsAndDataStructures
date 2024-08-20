package FreeLearn.Book;

import java.util.Random;

public class Bab6_20b {
    public static void main(String[] args) {
        Random random = new Random();

        long n = Math.round(1_000_000_000_000L * random.nextFloat());

        // Dari Depan
        System.out.println("dijit 9 dari " + n + " adalah " + dijitDariDepan(n, 9));
        System.out.println("dijit 8 dari " + n + " adalah " + dijitDariDepan(n, 8));
        System.out.println("dijit 7 dari " + n + " adalah " + dijitDariDepan(n, 7));
        System.out.println("dijit 6 dari " + n + " adalah " + dijitDariDepan(n, 6));
        System.out.println("dijit 5 dari " + n + " adalah " + dijitDariDepan(n, 5));
        System.out.println("dijit 4 dari " + n + " adalah " + dijitDariDepan(n, 4));
        System.out.println("dijit 3 dari " + n + " adalah " + dijitDariDepan(n, 3));
        System.out.println("dijit 2 dari " + n + " adalah " + dijitDariDepan(n, 2));
        System.out.println("dijit 1 dari " + n + " adalah " + dijitDariDepan(n, 1));
        System.out.println("dijit 0 dari " + n + " adalah " + dijitDariDepan(n, 0));
    }

    static long dijitDariDepan(long n, int k) {
        long l = 1;
        for(var i = 0; i < length(n) - (k + 1); i++) {
            l *= 10;
        }
        return (n / l) % 10;
    }

    static int length(long n) {
        int l = 0;
        while(n > 0) {
            n /= 10;
            l++;
        }
        return l;
    }
}
