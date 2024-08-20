package JavaGeneric.Helper;

public class MathHelper {
    public static <T> int count(T[] array) {
        return array.length;
    }
}
