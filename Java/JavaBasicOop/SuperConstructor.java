package JavaBasicOop;

class Animal {
    String name = "Without a name";

    Animal(String name) {
        this.name = name;
    }

    Animal() {}

    public void print() {
        System.out.println(this.name);
    }
}

class Cat extends Animal {
    // Will be thrown to the parent constructor
    Cat(String name) {
        super(name);
    }

    Cat() {}
}

public class SuperConstructor {
    public static void main(String[] args) {
        new Cat("Meng").print();
        new Cat().print();
    }
}
