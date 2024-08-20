package JavaBasicOop.Util;

public class MathUtil {
    public static int sumOf(int... values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }

        return total;
    }
}