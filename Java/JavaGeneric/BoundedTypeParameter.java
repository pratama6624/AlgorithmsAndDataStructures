package JavaGeneric;

// Bounded Type Parameter
import JavaGeneric.Data.NumberData;
import JavaGeneric.Data.StringData;

// Limits the data types can be accepted by our generic class
public class BoundedTypeParameter {
    public static void main(String[] args) {
        NumberData<Integer> number = new NumberData<>(1_500);
        System.out.println("Number : " + number.getNumber());

        NumberData<Double> doubleNumber = new NumberData<>(12.1);
        System.out.println("Double : " + doubleNumber.getNumber());

        // Error because it is not an instance of the number class
        // NumberData<String> stringData = new NumberData<String>("Pratama");

        StringData<String> stringData1 = new StringData<String>("Pratama");
        System.out.println("String : " + stringData1.getStringData());
    }
}
