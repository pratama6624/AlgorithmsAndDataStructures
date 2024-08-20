package JavaLambda.Util;

public class NumberChecker {
    // non static method -> method reference
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
