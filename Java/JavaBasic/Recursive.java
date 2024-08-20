package JavaBasic;

public class Recursive {
    public static void main(String[] args) {
        // Recursive function or method
        // a method that calls itself

        // Factorial
        // 4! => 4 * 3 * 2 * 1 = 24
        // 7! => 7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
        // Formula for factorial => f(x) = n * (n - 1)
        int n = 7;
        long f = factorial(n);
        System.out.println("Factorial " + n + "\t: " + f);
        System.out.println("Factorial 5\t: " + factorial(5));

        // Fibonnaci
        // 0 1 1 2 3 5 8 13 21 34 55 89 ....... n
        n = 6;
        int fibbo = fibbonaci(n);
        System.out.println("Fibbonaci " + n + "\t: " + fibbo);
        System.out.println("Fibbonaci 10\t: " + fibbonaci(10));
    }

    // Factorial recursive function
    public static long factorial(int n) {
        if(n == 0) return 1;
        return n * (factorial(n - 1));
    }

    // Fibbonaci
    // Recursive branches which will form a binery tree
    public static int fibbonaci(int n) {
        if(n == 0 || n == 1) return n;
        return fibbonaci(n - 1) + fibbonaci(n - 2);
    }

}
