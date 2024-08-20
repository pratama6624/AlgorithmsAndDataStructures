package JavaBasicOop;

class Person {
    String name;
    String address;
    int age;
    // Final is a keyword for something that is fixed and cannot be changed
    final String country = "South Korea";
}

public class Field {
    public static void main(String[] arga) {
        var person = new Person();
        person.name = "Chaeyoung";
        person.address = "Seoul";
        person.age = 23;
        // person.country = "Indonesian"; // Error => final field

        System.out.println("My name is " + person.name + ", i live in " + person.address + " city " + person.country + ", i'm " + person.age + " years old.");
    }
}
