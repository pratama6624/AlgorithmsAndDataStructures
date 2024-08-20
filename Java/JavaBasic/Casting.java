package JavaBasic;

public class Casting {
    public static void main(String[] args) {
        // Casting Numeric Data Type
        // Widening (Automatic casting) : byte -> short -> int -> long -> float -> double

        int xInt = 1_000_000;
        long xLong = xInt;

        System.out.println("x int\t: " + xInt);
        System.out.println("x long\t: " + xLong);

        // Narrowing (Manual Casting) : double -> float -> long -> int -> short -> byte

        long yLong = 1_000_000L;
        // int yInt = yLong; // Error
        int yInt = (int) yLong;

        System.out.println("y long\t: " + yLong);
        System.out.println("y int\t: " + yInt);
    }
}
