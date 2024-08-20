package JavaBasicOop;

class TestConstructorOverloading {
    String name;

    // Tanpa parameter
    TestConstructorOverloading() {
        System.out.println("Hello");
    }

    // Dengan parameter ( Overloading )
    TestConstructorOverloading(String name) {
        this.name = name;
        System.out.println("Hello " + this.name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        var testConstructorOverloading = new TestConstructorOverloading();
        var testConstructorOverloading2 = new TestConstructorOverloading("Chaeyoung");
    }
}
