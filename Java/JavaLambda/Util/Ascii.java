package JavaLambda.Util;

import java.util.function.Predicate;

public class Ascii {
    // static method
    public static boolean ascii(String value) {
        for(var c : value.toCharArray()) {
            int letter = c;
            if(letter >= 48 && letter <= 57) {
                return true;
            }
        }
        return false;
    }
}
