package JavaBasic;

public class BreakContinue {
    public static void main(String[] args) {
        // Break
        // used to stop the loop
        for(var i = 0; i < 100;) {
            System.out.println("Loop\t: " + i);
            if(i == 10) break;
            i++;
        }

        System.out.println(); // next line

        int x = 100;
        while(x > 0) {
            System.out.println("While loop\t: " + x);
            x -= 2;
            if(x == 90) break;
        }

        System.out.println(); // next line

        // Continue
        // used to stop the current loop and continue to the next loop
        for(var i = 0; i < 20; i++) {
            // skip if number is odd
            // and continue loop
            if(i % 2 == 1) continue;
            System.out.println("Even\t: " + i);
        }
    }
}
