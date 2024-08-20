package JavaBasic;

public class IfStatement {
    public static void main(String[] args) {
        // Decision
        int attendance = 75;
        int value = 80;

        // if statement
        if(attendance >= 75 && value >= 75) {
            System.out.println("Congrats, you passed");
        }

        // if else statement
        if(attendance >= 75 && value >= 75) {
            System.out.println("Congrats, you passed");
        } else {
            System.out.println("You failed, please try again next year");
        }

        // else if statement
        if(attendance >= 85 && value >= 85) {
            System.out.println("A");
        } else if(attendance >= 75 && value >= 75) {
            System.out.println("B");
        } else if(attendance >= 65 && value >= 65) {
            System.out.println("C");
        } else if(attendance >= 55 && value >= 55) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
