package JavaBasic;

public class ForLoop {
    public static void main(String[] args) {
        // a for loop is a loop type where the end value of the loop is known

        // for(loop start, condition, post statement) {
        //      loop block
        // }

        // Integral(0, 10); -> from 0 to 9
        var i = 0;
        for(; i < 10;) {
            System.out.println("This is iteration " + i);
            i++;
        }

        System.out.println();

        for(var j = 1; j <= 10; j++) {
            System.out.println("This is iteration " + j);
        }
    }
}
