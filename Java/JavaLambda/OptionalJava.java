package JavaLambda;

import java.util.Optional;

public class OptionalJava {
    public static void main(String[] args) {
        // Success
        sayHay("Pratama");

        // Failed
        String name = null;
        sayHay(name);
    }

    public static void sayHay(String name) {
        Optional.ofNullable(name)
            .map(value -> value.toUpperCase())
                .ifPresentOrElse(
                    value -> System.out.println("Hay " + value),
                    () -> System.out.println("Just Hay")
                );
    }
}
