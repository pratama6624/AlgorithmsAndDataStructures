package JavaLambda;

// for testScore
import java.util.function.Supplier;

// Lazy parameter is code that will run only when that parameter is accessed, otherwise it is not
public class LambdaLazyParameter {
    public static void main(String[] args) {
        // Without Lazy
        System.out.println("If the condition is met the getName function will be called");
        testScore(85, () -> getName());

        System.out.println(); // new line
        
        System.out.println("If the condition is not met then getName function will be called");
        testScore(65, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if(score > 80) {
            System.out.println("Congratulations " + name.get() + ", you pass");
        } else {
            System.out.println("Please try again next year");
        }
    }

    // Gets the name from another function
    /*
     * And suppose the function to get the name is very slow,
     * Then we will just call this function only if the condition is satisfied
     */

     public static String getName() {
        System.out.println("Call getName functions : By default JAVA will call all functions even if here does not fulfill");
        return "Pratama";
     }
}
