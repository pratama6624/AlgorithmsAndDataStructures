package JavaGeneric;

import JavaGeneric.Data.Person;
import java.util.Arrays;

public class ComparableOperator {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Pratama", "Indonesia"),
            new Person("Chaeyoung", "South Korea"),
            new Person("Momo", "Japan")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
