package FreeLearn.Book;

public class Bab6_5 {
    public static void main(String[] args) {
        // Permutasi
        for(var i = 0; i < 10; i++) {
            for(var j = 0; j <= i; j++) {
                // In one function
                // System.out.println(i + " " + j + " : " + permutasi(i, j));
                // Call another function
                // System.out.println("p(" + i + ", " + j + ") = " + p(i, j));
                // Permutasi formula
                System.out.println("p(" + i + ", " + j + ") = " + permutasiFormula(i, j));
            }
            System.out.println();
        }

        // Factorial fwith recursive function
        for(var i = 0; i < 10; i++) {
            System.out.print("\n" + "Factorial " + i + " : " + factorialFunction(i));
        }
    }

    // In one function
    static long permutasi(int n, int k) {
        long p = 1;
        for(var i = 0; i < k; i++) {
            p *= n--;
        }
        return p;
    }

    static long p(int n, int k) {
        return f(n) / f(n - k);
    }

    static long permutasiFormula(int n, int k) {
        return factorialFunction(n) / factorialFunction(n - k);
    }

    static long f(int n) {
        long p = 1;
        while(n > 1) {
            p *= n--;
        }
        return p;
    }
    
    // Recursive function factorial
    static long factorialFunction(int n) {
        if(n == 0) return 1;
        return n * factorialFunction(n - 1);
    }
}
