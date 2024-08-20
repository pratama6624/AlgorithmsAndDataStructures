package FreeLearn.Book;

import java.lang.String;

public class Bab6_21 {
    // Fungsi recursive bercabang
    // Fibonacci dengan recursive fucntion
    public static void main(String[] args) {
        // Recursive konsep
        System.out.println(recursive(10));

        // Recursive Factorial
        System.out.println(factorial(7) + "\n");

        // Recursive Fibonacci ==> recursive bercabang
        System.out.println(f(5, "Root"));

        // Loop call
        // for(var i = 0; i < 7; i++) {
        //     System.out.println(fibonacci(i));
        //     System.out.println();
        // }
    }

    private static int recursive(int n) {
        System.out.println("n : " + n);
        if(n == 0) return 0;
        return n + recursive(n - 1);
    }

    static int factorial(int n) {
        if(n == 0) return 1;
        // System.out.println("n : " + n);
        int newN = n * factorial(n - 1);
        System.out.println("New n : " + newN);
        return newN;
    }

    static int f(int n, String leaf) {
        System.out.println("Leaf " + leaf + " : " + n);
        if(n == 1 || n == 0) return n;
        return f(n - 1, "L") + f(n - 2, "R");
    }

    static int fibonacci(int n) {
        if(n < 2) return n;
        // System.out.println("n : " + fibonacci(n - 1));
        System.out.println("n : " + n);
        int t1 = fibonacci(n - 1);
        int t2 = fibonacci(n - 2);
        // System.out.println("t1 : " + t1 + ", t2 : " + t2);
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
