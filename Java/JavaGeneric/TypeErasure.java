package JavaGeneric;

import JavaGeneric.Data.*;

/*
 * Type Erasure will read error-free in the code editor and is safe when compiling
 * but will crash when run
 */
public class TypeErasure {
    // Omit or not attach the generic data type
    public static void main(String[] args) {
        // Everything runs without problems
        // Example 1
        MyData genericWithoutInformation = new MyData("Pratama");
        System.out.println(genericWithoutInformation.getData());

        MyData<Integer> toInteger = (MyData<Integer>) genericWithoutInformation;
        Integer myInteger = toInteger.getData(); // Error

        System.out.println(myInteger); // Error

        // Example 2
        MyData genericType = new MyData(false);
        System.out.println(genericType);

        MyData<String> toStringType = (MyData<String>) genericType;
        String myString = toStringType.getData(); // Error

        System.out.println(myString); // Error
    }
}
