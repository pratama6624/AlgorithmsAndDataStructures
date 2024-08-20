package FreeLearn.Book;

public class Bab6_3 {
    // factorial
    public static void main(String[] args) {
        long[] numbers = new long[20];
        
        for(var i = 1; i <= numbers.length; i++) {
            long temp = 1;
            for(var j = 1; j < i; j++) {
                temp *= j;
            }
            numbers[i - 1] = temp;
        }

        for(var i = 0; i < numbers.length; i++) {
            System.out.println("f(" + i + ")\t= " + numbers[i]);
        }

        System.out.println("\nRecursive Function");

        long[] numbers1 = new long[20];
        numbers1[0] = 1;

        for(var i = 1; i < numbers1.length; i++) {
            numbers1[i] = recursiveFactorial(i);
        }

        for(var i = 0; i < numbers1.length; i++) {
            System.out.println("f(" + i + ")\t= " + numbers1[i]);
        }

        // Test StackOverflow Error
        System.out.println("\nTest Stack Error : " + recursiveFactorial(20) + "\n");

        long[] numbers2 = new long[20];
        
        // While Factorial
        for(var i = 0; i < numbers2.length; i++) {
            numbers2[i] = whileFactorial(i);
        }

        for(var i = 0; i < numbers2.length; i++) {
            System.out.println("f(" + i + ")\t= " + numbers2[i]);
        }
    }

    // Recursive Function
    static long recursiveFactorial(int n) {
        if(n == 0) return 1;
        return n * recursiveFactorial(n - 1);
    }

    static long whileFactorial(int n) {
        long f = 1;
        while(n > 1) {
            f *= n--;
        }
        return f;
    }
}
