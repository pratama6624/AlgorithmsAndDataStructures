package JavaLambda;

import java.util.function.Consumer;

// Consumer -> only used to accept a parameter and does not return anything or void
public class JavaUFConsumer {
    public static void main(String[] args) {
        // Interface java.util.fucntion
        // With Lambda 1
        Consumer<String> myName = new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello me, " + name);
            }
        };
        myName.accept("Pratama");

        // With Lambda 2
        Consumer<String> myName1 = (String name) -> {
            System.out.println("Hello me 1, " + name);
        };
        myName1.accept("Chaeyoung");

        // With Lambda 2
        Consumer<String> myName2 = (name) -> {
            System.out.println("Hello me 2, " + name);
        };
        myName2.accept("Nayeon");

        // With Lambda 3
        Consumer<String> myName3 = (value) -> System.out.println("Hello me 3, " + value);
        myName3.accept("Sana");
    }
}
