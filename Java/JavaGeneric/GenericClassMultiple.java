package JavaGeneric;

import JavaGeneric.Data.MyDataMultiple;

public class GenericClassMultiple {
    public static void main(String[] args) {
        MyDataMultiple data = new MyDataMultiple<>();
        data.setFirst("Chaeyoung");
        data.setSecond(23);
        System.out.println(data.toString());

        MyDataMultiple data1 = new MyDataMultiple<>(100, 10.2);
        System.out.println(data1.toString());
    }
}
