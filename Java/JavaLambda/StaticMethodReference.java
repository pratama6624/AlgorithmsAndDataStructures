package JavaLambda;

import java.util.function.Predicate;
import JavaLambda.Util.StringUtil;
import JavaLambda.Util.Ascii;

public class StaticMethodReference {
    public static void main(String[] args) {
        // When a lambda only contains methods that call other method
        // We start from the static method

        // Example 1
        
        // By lambda but not by reference
        String name = "pratama";

        // Lambda 1
        Predicate<String> predicateLowerTest = (String value) -> {
            // Call another function or method
            return StringUtil.isLowerCase(value);
        };
        System.out.println("Is " + name + " lower case " + predicateLowerTest.test(name));

        name = "PRATAMA";

        // Lambda 2
        Predicate<String> predicateLowerTest2 = (value) -> StringUtil.isLowerCase(value);
        System.out.println("Is " + name + " lower case " + predicateLowerTest2.test(name));

        name = "Chaeyoung";

        // Lambda with reference in it
        Predicate<String> predicateLowerTest3 = StringUtil::isLowerCase;
        System.out.println("Is " + name + " lower case " + predicateLowerTest3.test(name));

        // Example 2

        // ASCII
        name = "Chaeyoung";

        Predicate<String> stringNumber = Ascii::ascii;
        System.out.println(name + " contains numbers " + stringNumber.test(name));
    }
}
