package JavaGeneric;

import JavaGeneric.Data.*;

public class Wildcard {
    // Wildcard is a way to retrieve or print data regradless of the generic data type by using the ?
    public static void main(String[] args) {
        MyData<String> myString = new MyData<String>("Pratama");
        MyData<Integer> myInteger = new MyData<Integer>(100);
        MyData<Boolean> myBoolean = new MyData<Boolean>(true);

        print(myString);
        print(myInteger);
        print(myBoolean);
        
        System.out.println();

        print(new MyData<>("Chaeyoung"));
        print(new MyData<>(false));
        print(new MyData<>(10.11));
        print(new MyData<>(100));
    }

    public static void print(MyData<?> myData) {
        System.out.println("Data : " + myData.getData());
    }
}
