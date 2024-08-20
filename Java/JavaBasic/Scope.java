package JavaBasic;

public class Scope {
    public static void main(String[] args) {
        // Scope is where a variable can be recognized and not recognized
        sayHay("Pratama");
    }

    // Method
    public static void sayHay(String name) {
        String hello = "Hello " + name;
        if(!name.isBlank()) {
            String hay = "Hay " + name;
            System.out.println(hay);
        }

        System.out.println(hello);
        
        // Variable will be not recognized outside the block
        // But, Variable will be recognized if they are in the same code block
        // System.out.println(hay); // Error
    }
}
