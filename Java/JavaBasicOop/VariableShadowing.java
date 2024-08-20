package JavaBasicOop;

// Variable shadowing bisa diselesaikan dengan this
class TestVariableShadowing {
    String name;

    TestVariableShadowing(String name) {
        this.name = name;
    }

    public void print(String name) {
        // Variable shadowing
        /*
         * Where the variable name in the field will be covered by the variable method
         * Because it has the same name
         * Can be resolved with the this keyword
         */
        System.out.println("Hello " + name + " i'm " + this.name);
    }
}

public class VariableShadowing {
    public static void main(String[] args) {
        new TestVariableShadowing("Pratama").print("Chaeyoung");
    }
}
