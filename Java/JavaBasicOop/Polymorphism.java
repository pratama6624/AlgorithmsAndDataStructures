package JavaBasicOop;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Employee " + this.name);
    }
}

// Polymorphism is a change in shape
class Managers extends Employee {
    Managers(String name) {
        super(name);
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Manager " + this.name);
    }
}

class Vice extends Managers {
    Vice(String name) {
        super(name);
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Vice " + this.name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Chaeyoung");
        employee.sayHay("Pratama");

        employee = new Managers("Chaeyoung");
        employee.sayHay("Pratama");

        employee = new Vice("Chaeyoung");
        employee.sayHay("Pratama");
    }
}
