package JavaBasic;

public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator is os the form an 'if statement' in 1 line

        // Example fo 'if statement'
        boolean light = true;
        if(light) {
            System.out.println("The light is on");
        } else {
            System.out.println("The light is off");
        }

        // with Ternary Operator
        light = false;
        System.out.println(
            (light) ? "The light is on" : "The light is off"
        );

        // Example 2
        int attendance = 75;
        int value = 80;
        
        if(attendance >= 85 && value >= 85) {
            System.out.println("rate : A");
        } else if(attendance >= 75 && value >= 75) {
            System.out.println("rate : B");
        } else if(attendance >= 65 && value >= 65) {
            System.out.println("rate : C");
        } else if(attendance >= 55 && value >= 55) {
            System.out.println("rate : D");
        } else {
            System.out.println("rate : E");
        }

        // with Ternary Operator
        String rate = (attendance >= 85 && value >= 85)
                        ? "A"
                        : (attendance >= 75 && value >= 75)
                            ? "B"
                            : (attendance >= 65 && value >= 65)
                                ? "C"
                                : (attendance >= 55 && value >= 55)
                                    ? "D"
                                    : "E";

        System.out.println("rate : " + rate);
    }
}
