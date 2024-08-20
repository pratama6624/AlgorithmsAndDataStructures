package JavaLambda;

import java.util.function.Predicate;

// Predicate -> used to receive parameters and return boolean values with primitive data types
public class JavaUFPredicate {
    public static void main(String[] args) {
        // Anonymous class
        Predicate<String> checkBlank = new Predicate<>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };
        System.out.println("Anonymous -> " + checkBlank.test(""));

        // Lambda
        Predicate<String> checkBlank2 = (String value) -> value.isBlank();
        System.out.println("Lambda -> " + checkBlank2.test("Not Blank"));
    }
}
