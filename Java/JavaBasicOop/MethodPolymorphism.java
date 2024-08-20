package JavaBasicOop;

class EmployeeMP {
    String name;

    EmployeeMP(String name) {
        this.name = name;
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Employee " + this.name);
    }
}

class ManagerMP extends EmployeeMP {

    ManagerMP(String name) {
        super(name);
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Manager " + this.name);
    }
}

class VicePresidentMP extends ManagerMP {

    VicePresidentMP(String name) {
        super(name);
    }

    public void sayHay(String name) {
        System.out.println("Hello " + name + " My name is Vice President " + this.name);
    }
}

public class MethodPolymorphism {
    public static void main(String[] args) {
        sayHello(new EmployeeMP("Chaeyoung"));
        sayHello(new VicePresidentMP("Nayeon"));
        sayHello(new ManagerMP("Sana"));
    }

    public static void sayHello(EmployeeMP employeeMP) {
        System.out.println("Hello " + employeeMP.name);
    }
}
