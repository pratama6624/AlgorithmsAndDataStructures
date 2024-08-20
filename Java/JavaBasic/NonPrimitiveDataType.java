package JavaBasic;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
        // Programming Languange default data type
        
        // Primitive data type
        // byte, short, int, long, float, double, boolean

        // Non Primitive data type
        // Byte, Short, Integer, Long, Float, Double, Boolean, Object (OOP)

        // default value non primitive data type is null

        // Data type convertion (Auto)
        Integer xInteger = 24;
        int xInt = xInteger;
        Integer yInteger = xInt;
        
        // Primitive to Non-Primitive
        long xlong = yInteger.longValue();

        System.out.println("long value : " + xlong);

        // Primitive to Primitive
        short xshort = (short) xlong;
        System.out.println("short value : " + xshort);
    }
}
