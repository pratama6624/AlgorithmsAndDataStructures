package FreeLearn.Book;

public class Bab6_17 {
    public static void main(String[] args) {
        // Desimal dengan pangkat negatif
        // misal 2.0 ^ -3 => (1.0 / 2.0) ^ -3 => (0.5) ^ -3 => 0.5 * 0.5 * 0.5 => 0.125
        for(var n = -3; n < 7; n++) {
            System.out.println(pangkat(2.0, n));
        }
    }

    static double pangkat(double x, int n) {
        double p = 1.0;
        // jika n = -n maka p akan tetap 1.0
        for(int i = 0; i < n; i++) {
            p *= x;
        }
        // fungsi -n adalah membalik nilai n (+ & -)
        for(var i = 0; i < -n; i++) {
            p /= x;
        }
        return p;
    }
}
