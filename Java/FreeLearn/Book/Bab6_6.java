package FreeLearn.Book;

public class Bab6_6 {
    public static void main(String[] args) {
        /*
            Kombinasi
            p = permutasi, f = factorial, c = kombinasi, pf = permutasi function
                Rumus Permutasi :
                    p(n, k) => f(n) / f(n - k)
                Rumus Kombinasi :
                    c(n, k) => p(n, k) / f(n)
        */

        for(var i = 0; i < 10; i++) {
            for(var j = 0; j <= i; j++) {
                // Call function
                System.out.println("c(" + i + ", " + j +") = " + c(i, j));
                // One Line
                // System.out.print(c(i, j) + "  ");
            }
            System.out.println();
        }
    }

    static long c(int n, int k) {
        return (pf(n, k)) / f(k);
    }

    static long pf(int n, int k) {
        return f(n) / f(n - k);
    }

    static long f(int n) {
        if(n == 0) return 1;
        return n * f(n - 1);
    }
}
