package FreeLearn.JavaLambda;

import FreeLearn.JavaLambda.Interface.MyConsumer;

public class Consumer {
    public static void main(String[] args) {
        MyConsumer<String> myName = new MyConsumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello me, " + name);
            }
        };
        myName.accept("Pratama");

        MyConsumer<String> myName1 = (String name) -> {
            System.out.println("Hello me 1, " + name);
        };
        myName1.accept("Chaeyoung");

        MyConsumer<Integer> myAge = (age) -> System.out.println("My Age " + age);
        myAge.accept(24);
    }
}
