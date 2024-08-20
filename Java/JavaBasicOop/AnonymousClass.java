package JavaBasicOop;

interface HelloWorld {
    public void sayHello();
    public void introduction(String name);
}

public class AnonymousClass {
    public static void main(String[] args) {
        
        // Anonymous class
        HelloWorld hello = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
            @Override
            public void introduction(String name) {
                System.out.println("Hello my name is " + name);
            }
        };

        hello.sayHello();
        hello.introduction("Son Chaeyoung");
        hello.introduction("Pratama");
    }
}
