package JavaBasicOop;

class TestMethodOverriding {
    String name;

    public void introduction(String name) {
        System.out.println("Hello " + name + ", i'm " + this.name + " ( Manager )");
    }
}

class TestMethodOverridingChild extends TestMethodOverriding {
    @Override
    public void introduction(String name) {
        System.out.println("Hello " + name + ", i'm " + this.name + " ( Vice President )");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        var testMethodOverriding = new TestMethodOverriding();
        testMethodOverriding.name = "Chaeyoung";
        testMethodOverriding.introduction("Pratama");

        var testMethodOverriding2 = new TestMethodOverridingChild();
        testMethodOverriding2.name = "Nayeon";
        testMethodOverriding2.introduction("Pratama");
    }
}
