package FreeLearn.Book;

public class Bab6_22 {
    public static void main(String[] agrs) {
        System.out.println("gdc : " + gdc(6, 30) + "\n");
        System.out.println("mygdc : " + mygdc(6, 30));
        System.out.println("gdc recursive : " + gdcRecursive(6, 30));
    }

    static int gdc(int m, int n) {
        while(m > 0) {
            if(m < n) {
                int temp = m;
                m = n;
                n = temp;
            }
            m -= n;
            System.out.println("m : " + m + ", n : " + n + " => " + (m - n));
        }
        return n;
    }

    static long mygdc(int m, int n) {
        if(n > m) {
            int temp = m;
            m = n;
            n = temp;
        }

        while(n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    // Masih error stackOverFlow
    static int gdcRecursive(int m, int n) {
        if(m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if(m == 0) return 0;
        return gdcRecursive(m - n, n);
    }
}
