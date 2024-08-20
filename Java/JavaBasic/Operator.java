package JavaBasic;

public class Operator {
    public static void main(String[] args) {
        // Math Operator
        // +,  -,  *,  /,  %

        int x = 20 + 1;
        long y = 1_000L * 2_000_000;
        short z = 20 / 2;
        int mod = 21 % 2;

        System.out.println("20 + 1 = " + x);
        System.out.println("1.000 * 2.000.000 = " + y);
        System.out.println("20 / 2 = " + z);
        System.out.println("21 mod 2 = " + mod + "\n");

        // Augmented Assignment
        // +=,  -=,  *=,  /=,  %=

        x -= 1;
        y /= 1_000;
        z *= 2;
        mod %= 2;

        System.out.println("x - 1 = " + x);
        System.out.println("y / 1.000 = " + y);
        System.out.println("z * 2 = " + z);
        System.out.println("mod mod 2 = " + mod + "\n");

        // Unary Operator
        // Additional symbol before or after the variable
        // ++,  --,  -,  +,  !
        
        x++;
        y--;
        int negative = -10;
        int positive = 10;
        boolean bool = !true;

        System.out.println("x++ = " + x);
        System.out.println("y-- = " + y);
        System.out.println("negative = " + negative);
        System.out.println("positive = " + positive);
        System.out.println("boolean bool = " + bool + "\n");

        // Comparison Operator
        // Operator to compare 2 or more values and will produce a boolean data type
        // <,  >,  <=,  >=,  ==,  !=

        boolean a = 10 < 9;
        boolean b = 10 > 9;
        boolean c = 10 <= 10;
        boolean d = 10 >= 11;
        boolean e = 10 != 9;

        System.out.println("boolean a = " + a);
        System.out.println("boolean b = " + b);
        System.out.println("boolean c = " + c);
        System.out.println("boolean d = " + d);
        System.out.println("boolean e = " + e + "\n");

        // Boolean Operator or Logical Operator
        // &&(and),  ||(or),  !(negasi)

        // T  &&  T  =>  T
        // T  &&  F  =>  F
        // F  &&  T  =>  F
        // F  &&  F  =>  F

        // T  ||  T  =>  T
        // T  ||  F  =>  T
        // F  ||  T  =>  T
        // F  ||  F  =>  F

        // !T  =>  F
        // !F  =>  T

        // T  &&  T  ||  T  ||  F  =>  T
        // T  &&  F  &&  T  &&  T  =>  F

        int attendace, value;
        String mahasiswa1 = "pratama";
        attendace = 76;
        value = 95;

        if(attendace >= 75 && value >= 65) {
            System.out.println("Mahasiswa " + mahasiswa1 + " lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }
    }
}
