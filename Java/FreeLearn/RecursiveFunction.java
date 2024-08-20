package FreeLearn;

import java.lang.String;
import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        // Factorial
        // int x = 5;
        // long f1 = factorialRecursive(x);
        // System.out.println("Long " + x + " : " + f1 + "\n");

        // Sum Of
        // x = 100;
        // int sumOf = sumOf(x);
        // System.out.println("Sum Of " + sumOf + " : " + sumOf + "\n");

        // int sum = 0;
        // for(var i = 0; i <= 100; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum : " + sum);

        // Fibonnaci
        // 1 2 3 4 5 6 7  8  9  10 11
        // 1 1 2 3 5 8 13 21 34 55 89 ... n
        // System.out.println("f(10) => " + f(10, "root"));
        
        System.out.println();

        // System.out.println("p(7, 7) => " + p(7, 7));

        
        // System.out.println("f(n) => f(n - 3) + f(n - 2) + f(n - 1)\n");
        // System.out.println("f(10) => 230\n");

        // System.out.println("n value  : 0  1  2  3  4  5   6   7   8   9    10   11");
        // System.out.println("x value  : 0  1  2  3  6  11  20  37  68  125  230  423\n");


        // Scanner in = new Scanner(System.in);
        // System.out.print("Custom Fibonnaci : ");
        // int numberIn = in.nextInt();

        // System.out.println("\nf(" + numberIn + ") => " + customFibo(numberIn, "root"));

        basis(315);
        // 22 / 2 = 0, 11 / 2 = 1, 5 / 1 = 1, 2 / 2 = 0 , 1
        // 22 basis 2 = 10110
    }

    static void basis(int value) {
        if(value == 1) {
            System.out.println("mod : " + 1);
            return;
        }
        int mod = value % 2;
        basis((int) Math.floor((value / 2) * 1.0));
        System.out.println("mod : " + mod);
    }

    static int f(int n, String leaf) {
        // System.out.println("leaf " + leaf + "\t: " + n);
        if(n == 0 || n == 1) return n;
        return f(n - 2, "left") + f(n - 1, "right");
    }

    static int factorialRecursive(int n) {
        if(n == 1) return 1;
        return n * (factorialRecursive(n - 1));
    }

    static int customFibo(int n, String leaf) {
        System.out.println("leaf " + leaf + "\t: " + n);
        if(n == 0 || n == 1 || n == 2) return n;
        return customFibo(n - 3, "left") + customFibo(n - 2, "middle") + customFibo(n - 1, "right");
    }

    static int sumOf(int n) {
        if(n == 0) return 0;
        return n + (sumOf(n - 1));
    }

    static int p(int bilangan, int pangkat) {
        if(pangkat == 0) return 1;
        return bilangan * p(bilangan, pangkat - 1);
    }
}
