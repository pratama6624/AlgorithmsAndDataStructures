package FreeLearn.Book;

public class Bab6_15 {
    public static void main(String[] args) {
        // Permutasi dengan loop while
        for(var i = 0; i < 10; i++) {
            for(var j = 0; j <= i; j++) {
                System.out.println(i + " P " + j + " = " + p(i, j) + "  ");
            }
            System.out.println();
        }
    }

    static long p(int n, int k) {
        long p = 1;
        while(k-- > 0) {
            p *= n--;
        }
        return p;
    }
}
