package JavaBasicOop;

// Abstract class is a class that cannot be declared and can only be inherited
abstract class Animals {
    public String name;

    // Abstract methot mush be override
    public abstract void run();
}

class Dog extends Animals {
    Dog(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Dog " + this.name + " is running");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        System.out.println(new Dog("Doggy").name);

        new Dog("Doggy").run();
    }
}
