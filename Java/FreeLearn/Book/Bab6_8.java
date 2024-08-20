package FreeLearn.Book;

import java.util.ArrayList;
import java.util.List;

public class Bab6_8 {
    public static void main(String[] args) {
        List<Integer> listOfPrimeNumbers = new ArrayList<>();

        for(var i = 2; i < 80; i++) {
            if(isPrime(i)) listOfPrimeNumbers.add(i);
        }

        listOfPrimeNumbers.forEach(v -> System.out.println(v));
    }

    static boolean isPrime(int n) {
        int f = (int) Math.floor(Math.sqrt(n));

        for(var i = 2; i <= f; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
