package JavaBasicOop;

class EmployeeTCC {
    String name;

    EmployeeTCC(String name) {
        this.name = name;
    }
}

class ManagerTCC extends EmployeeTCC {
    ManagerTCC(String name) {
        super(name);
    }
}

class VicePresidentTCC extends ManagerTCC {
    VicePresidentTCC(String name) {
        super(name);
    }
}

public class TypeCheckCasts {
    public static void main(String[] args) {
        sayHello(new EmployeeTCC("Chaeyoung"));
        sayHello(new ManagerTCC("Nayeon"));
        sayHello(new VicePresidentTCC("Sana"));
    }

    static void sayHello(EmployeeTCC employeeTCC) {
        if(employeeTCC instanceof VicePresidentTCC) {
            VicePresidentTCC vicePresidentTCC = (VicePresidentTCC) employeeTCC;
            System.out.println("Hello VP " + vicePresidentTCC.name);
        } else if(employeeTCC instanceof ManagerTCC) {
            ManagerTCC managerTCC = (ManagerTCC) employeeTCC;
            System.out.println("Hello Manager " + managerTCC.name);
        } else {
            System.out.println("Hello Employee " + employeeTCC.name);
        }
    }
}
