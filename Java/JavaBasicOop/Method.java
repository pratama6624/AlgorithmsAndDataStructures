package JavaBasicOop;

class TestMethod {
    String manager;

    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void introduction(String name) {
        System.out.println("Hello " + name + " i'm " + this.manager);
    }
}

public class Method {
    public static void main(String[] args) {
        var dataMethod = new TestMethod();
        dataMethod.manager = "Chaeyoung";

        // Function or method is a block of code that will run whenwe call it
        dataMethod.sayHelloWorld();
        dataMethod.sayHello("Pratama");
        dataMethod.introduction("Pratama");
    }
}
