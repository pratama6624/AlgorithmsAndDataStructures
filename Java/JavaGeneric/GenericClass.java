package JavaGeneric;

import JavaGeneric.Data.*;

public class GenericClass {
    public static void main(String[] args) {
        // This is a generic example in JAVA with the primitive data type parameter added
        // 1 class can accept different data types
        MyData<String> dataString = new MyData<String>("Pratama");
        MyData<Integer> dataInteger = new MyData<Integer>(23);

        System.out.println("String : " + dataString.getData());
        System.out.println("Integer : " + dataInteger.getData());
    }
}
