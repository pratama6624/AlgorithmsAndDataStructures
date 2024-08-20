package JavaBasic;

// ignore this
import java.util.Arrays;

public class DoWhileLoop {
    public static void main(String[] args) {
        // do while loop is a loop similar to a while loop, except that it checks the codition at the end
        // do while loop will be processed 1 time even though the condition are not met from the start

        // do whatever it is first then check and repeat the process

        var x = 0;
        do{
            // do whatever it is
            System.out.println("This is iteration " + x);
            // post condition
            x++;
        } while(x < 0); // check condition


        int[] data = new int[10];
        var count = 0;
        var y = 1;
        do{
            // do it
            // push it into array
            data[count++] = y;
            y+=2;
        } while (y < 20);

        System.out.println(Arrays.toString(data));
    }
}
