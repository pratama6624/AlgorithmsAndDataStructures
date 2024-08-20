package FreeLearn.Book;

public class Bab6_7 {
    // Recursive Function
    public static void main(String[] args) {
        for(var i = 0; i < 9; i++) {
            System.out.println("f(" + i + ")\t: " + recursiveFactorial(i));
        }
    }

    static long recursiveFactorial(int n) {
        if(n == 0) return 1;
        return n * recursiveFactorial(n - 1);
    }
}
