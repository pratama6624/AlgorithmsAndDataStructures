package JavaLambda;

import java.util.function.Predicate;
import JavaLambda.Util.*;

public class NonStaticMethodReference {
    public static void main(String[] args) {
        // In the same class
        new NonStaticMethodReference().run("Pratama123");
    }

    public void run(String value) {
        // Anonymous class
        Predicate<String> predicateTest = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return NonStaticMethodReference.this.numberChecker(value);
            }
        };
        System.out.println("Anonymous class -> " + value + " contains numbers " + predicateTest.test(value));

        // Lambda
        Predicate<String> predicateTest2 = this::numberChecker;
        System.out.println("Lambda -> " + value + " contains numbers " + predicateTest2.test(value));

        // if the non class static method is in someone else's class
        NumberChecker otherApps = new NumberChecker();
        Predicate<String> predicateTest3 = otherApps::numberChecker;
        System.out.println("Lambda other apps -> " + value + " contains numbers " + predicateTest3.test(value));
    }

    // non static method
    public boolean numberChecker(String value) {
        for(var c : value.toCharArray()) {
            int letter = c;
            if(letter >= 48 && letter <= 57) {
                return true;
            }
        }
        return false;
    }
}
