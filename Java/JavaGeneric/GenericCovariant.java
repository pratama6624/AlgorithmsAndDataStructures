package JavaGeneric;

import JavaGeneric.Data.MyData;

// Covariant meaning we can change the form but can only read it
// Covariant Child Class to Parent Class
public class GenericCovariant {
    public static void main(String[] args) {
        MyData<Integer> age = new MyData<>(23);
        excecute(age);

        MyData<? extends Object> data = age;
        System.out.println("Data Age : " + data.getData());

        // Safe
        MyData<String> myAge = new MyData<>("Dua Puluh Tiga");
        excecute(myAge);

        MyData<? extends Object> dataAge = myAge;
        System.out.println("Data My Age : " + dataAge.getData());
    }

    public static void excecute(MyData<? extends Object> myData) {
        System.out.println("Data : " + myData.getData());
        // myData.setData("Pratama"); // Error
    }
}
