package JavaGeneric;

import static JavaGeneric.Helper.MathHelper.count;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Numbers all : " + count(numbers));

        String[] names = new String[]{"Pratama", "Chaeyoung", "Nayeon", "Momo", "Jeongyeon"};
        System.out.println("Name all : " + count(names));
    }
}
