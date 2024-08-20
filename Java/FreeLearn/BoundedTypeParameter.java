package FreeLearn;

interface Introduction {
    public void introduction();
}

// Kepala Sekolah
abstract class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
}

class VicePresident extends Manager implements Introduction {
    
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void introduction() {
        System.out.println("Vice President : " + this.getName());
    }
}

class CompanyData<T extends Employee> {
    private T data;

    public CompanyData(T data) {
        this.data = data;
    }

    public T getCompanyData() {
        return this.data;
    }

    public void setCompanyData(T data) {
        this.data = data;
    }
}

public class BoundedTypeParameter {
    public static void main(String[] args) {
        CompanyData<Manager> manager = new CompanyData<>(new Manager("Nana"));
        System.out.println(manager.getCompanyData().getName());
        // manager.getCompanyData().introduction(); // Error

        CompanyData<VicePresident> vp = new CompanyData(new VicePresident("Nina"));
        vp.getCompanyData().introduction();
    }
}
