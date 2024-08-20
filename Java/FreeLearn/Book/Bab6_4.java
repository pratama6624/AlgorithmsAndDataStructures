package FreeLearn.Book;

public class Bab6_4 {
    public static void main(String[] args) {
        System.out.println("Permutasi :");
        for(var i = 0; i < 10; i++) {
            for(var j = 0; j <= i; j++) {
                // System.out.println(i + " " + j + " = " + permutasi(i,j));
                permutasi(i, j);
            }
            System.out.println();
        }

        System.out.println("\n");

        System.out.println("Factorial :");
        for(var i = 0; i < 10; i++) {
            System.out.println(i + " = " + f(i));
        }

        System.out.println("\n");

        // Konsep
        int a, b, p;
        a = 8;
        b = 4;
        p = 1;
        System.out.println("Nilai " + a + " dan " + b + " : ");
        for(var i = 0; i < b; i++) {
            System.out.print(p + " * " + (a--) + " *= ");
        }

    }

    static /*long*/ void permutasi(int i, int j) {
        long p = 1;
        for(var k = 0; k < j; k++) {
            // p *= i--;
            System.out.print(p + " *= " + (i--) + " ");
        }
        System.out.println();
        // return p;
    }

    static long f(int n) {
        if(n == 0) return 1;
        return n * f(n - 1);
    }
}
