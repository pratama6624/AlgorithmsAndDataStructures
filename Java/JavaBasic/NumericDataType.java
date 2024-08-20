package JavaBasic;

public class NumericDataType {
    public static void main(String[] args) {
        // Trere are basically 2 numeric data types in Java
        // 1. Integer Number
        // byte, short, int, long

        // byte
        byte byteMin = Byte.MIN_VALUE; // -128
        byte byteMax = Byte.MAX_VALUE; // 127
        byte byteSize = Byte.SIZE; // 1 byte or 8 bits

        System.out.println("This is byte");
        System.out.println("byte min value\t: " + byteMin);
        System.out.println("byte max value\t: " + byteMax);
        System.out.println("byte Size\t: " + byteSize);

        // short
        short shortMin = Short.MIN_VALUE; // -32_768
        short shortMax = Short.MAX_VALUE; // 32_767
        byte shortSize = Short.SIZE; // 2 byte or 16 bits

        System.out.println("\nThis is short");
        System.out.println("short min value\t: " + shortMin);
        System.out.println("short max value\t: " + shortMax);
        System.out.println("short Size\t: " + shortSize);

        // int
        int intMin = Integer.MIN_VALUE; // -2_147_483_648
        int intMax = Integer.MAX_VALUE; // 2_147_483_647
        byte intSize = Integer.SIZE; // 4 byte or 32 bits

        System.out.println("\nThis is int");
        System.out.println("int min value\t: " + intMin);
        System.out.println("int max value\t: " + intMax);
        System.out.println("int Size\t: " + intSize);

        // long
        long longMin = Long.MIN_VALUE; // -9_223_372_036_854_775_807
        long longMax = Long.MAX_VALUE; // 9_223_372_036_854_775_807
        byte longSize = Long.SIZE; // 8 byte or 64 bits

        System.out.println("\nThis is long");
        System.out.println("long min value\t: " + longMin);
        System.out.println("long max value\t: " + longMax);
        System.out.println("long Size\t: " + longSize);

        // 2. Floating Point
        // float, double

        // float
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        byte floatSize = Float.SIZE; // 4 byte or 32 bits

        System.out.println("\nThis is float");
        System.out.println("float min value\t: " + floatMin);
        System.out.println("float max value\t: " + floatMax);
        System.out.println("float Size\t: " + floatSize);

        // double
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        byte doubleSize = Double.SIZE; // 8 byte or 64 bits

        System.out.println("\nThis is double");
        System.out.println("double min val\t: " + doubleMin);
        System.out.println("double max val\t: " + doubleMax);
        System.out.println("double Size\t: " + doubleSize);

        // Literal Data Type
        // Decimal, Hexa, Binary

        // Decimal
        int decimal = 24;
        System.out.println("\nThis is decimal\t: " + decimal);

        // Hexa
        int hexa = 0xF5;
        System.out.println("This is hexa\t: " + hexa);

        // Binary
        int binary = 0b1010101;
        System.out.println("This is binary\t: " + binary);

        // Underscore
        long balance = 1_000_000_000_000L;
        int sumOf = 70_000_000;
        System.out.println("\nThis is undersore for balance\t: " + balance);
        System.out.println("This is underscore for sumOf\t: " + sumOf);
    }
}
