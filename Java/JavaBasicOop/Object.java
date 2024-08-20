package JavaBasicOop;

// This si class
class DataClass {}

public class Object {
    public static void main(String[] args) {
        var data = new DataClass();
        DataClass data1 = new DataClass();

        DataClass data3;
        data3 = new DataClass();

        // Will print the location of the data type in memory
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data3);
    }
}
