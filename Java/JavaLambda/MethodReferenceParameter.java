package JavaLambda;

import java.util.function.Function;

public class MethodReferenceParameter {
    public static void main(String[] args) {
        // Lambda
        String name = "pratama";
        Function<String, String> upper = (value) -> value.toUpperCase();
        System.out.println(name + " to " + upper.apply(name));

        // Method reference
        name = "Chaeyoung";
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println(name + " to " + toUpper.apply(name));
    }
}
