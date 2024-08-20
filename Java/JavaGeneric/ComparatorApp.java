package JavaGeneric;

import JavaGeneric.Data.Person;
import java.util.Comparator;
import java.util.Arrays;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Pratama", "Indonesia"),
            new Person("Chaeyoung", "South Korea"),
            new Person("Momo", "Japan"),
            new Person("Jisso", "South Korea")
        };

        // We will assume eg the class Person is another person class that is not implementation comparable
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        // To sort
        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }
}
