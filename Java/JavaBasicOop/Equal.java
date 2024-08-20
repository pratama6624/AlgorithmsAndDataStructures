package JavaBasicOop;

public class Equal {
    public static void main(String[] args) {
        String one = "Pratama";
        one = one + " One";

        System.out.println(one);

        String two = "Pratama One";
        String three = "Pratama One";

        System.out.println(one == two);
        System.out.println(two == three);
        
        // Memory address
        System.out.println(System.identityHashCode(one));
        System.out.println(System.identityHashCode(two));
        System.out.println(System.identityHashCode(three));

        System.out.println(one.equals(two));
        System.out.println(two.equals(three));
    }
}
