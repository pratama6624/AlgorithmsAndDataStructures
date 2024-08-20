package FreeLearn.Book;

public class Bab6_16 {
    public static void main(String[] args) {
        /*
            Rumus Kombinasi V2
            c = kombinasi function, f = factorial function
            c(n, k) => f(n) / f(k) * f(n - k)
        */
        for(var i = 0; i < 10; i++) {
            for(var j = 0; j <= i; j++) {
                // System.out.print(i + " C " + j + " = " + c(i, j) + "  ");
                System.out.print(c(i, j) + " ");
            }
            System.out.println();
        }
    }

    static long c(int n, int k) {
        return f(n) / (f(k) * f(n - k));
    }

    static long f(int n) {
        if(n == 0) return 1;
        return f(n - 1) * n;
    }
}
