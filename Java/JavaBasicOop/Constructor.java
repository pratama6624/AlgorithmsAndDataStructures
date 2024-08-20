package JavaBasicOop;

class TestConstructor {
    // Has the same name as the class itself and will be the first to run when we initialize a class 
    TestConstructor() {
        System.out.println("Hello");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Initialize a class
        var testConstructor = new TestConstructor();
    }
}
