package JavaLambda;

import java.util.function.Function;

// Function -> used to accept a parameter and will return a result
public class JavaUFFunctions {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Anonymous class
        String name = "Kukuh Nur Pratama";
        Function<String, Integer> lengthOf = new Function<>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        System.out.println("Anonymous length of " + name + " is " + lengthOf.apply(name));

        // Lambda
        Function<String, Integer> lengthof2 = (String value) -> value.length();
        System.out.println("Lambda length of " + name + " is " + lengthof2.apply(name));

        // Anonymous class
        Function<Integer, String> getGrade = new Function<>() {
            @Override
            public String apply(Integer value) {
                if(value >= 85) {
                    return "A";
                } else if (value >= 65) {
                    return "B";
                } else {
                    return "C";
                }
            }
        };
        System.out.println("Grade for " + name + " is " + getGrade.apply(91));

        // Lambda
        Function<Integer, String> getGrade2 = (Integer value)
            -> (value >= 85) ? "A" : (value >= 65) ? "B" : "C";

        System.out.println("Grade for Rafa is " + getGrade2.apply(64));
    }
}
   