package JavaBasicOop;

class Manager {
    String name;

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", i'm " + this.name);
    }
}

/*
 * Inheritance means that all derived classes will inherit all the properties of their parent
 * Will have everything owned by its parent such as methods, filed, and others
 * 1 parent can have many children
 * But 1 child can only have 1 parent
 */
class VicePresident extends Manager{}


public class Inheritance {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Chaeyoung";
        manager.sayHello("Pratama");

        var vicePresident = new VicePresident();
        vicePresident.name = "Nayeon";
        vicePresident.sayHello("Pratama");
    }
}
