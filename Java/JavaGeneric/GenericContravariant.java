package JavaGeneric;

import JavaGeneric.Data.MyData;

// Contravariant adalah kebalikan dari covariant
// Bisa merubah dari parent ke child
// Aman untuk set data tapi tidak aman jika me read data atau membaca data
public class GenericContravariant {
    public static void main(String[] args) {
        MyData<Object> myData = new MyData<>("Pratama");

        MyData<? super String> myData1 = myData;

        System.out.println("Get data : " + myData1.getData());

        excecute(myData);

        System.out.println("After excecute : " + myData.getData());
    }

    public static void excecute(MyData<? super Integer> myData) {
        // read data
        // tidak aman
        myData.setData(100);
        String value = (String) myData.getData(); // Error
        System.out.println("Value String : " + value); // Error
        // bisa dipaksa tapi akan menghasilkan error jika input berupa Integer
        // karena Integer juga turunan dari Object

        // Set data
        // aman
        myData.setData(1_000_000);
    }
}
