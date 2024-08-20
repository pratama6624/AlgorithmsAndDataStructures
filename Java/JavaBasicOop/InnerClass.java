package JavaBasicOop;

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String getCompany() {
            return Company.this.getName();
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Company company = new Company("Pratama");
        System.out.println(company.getName());
        Company.Employee employee = company.new Employee("Chaeyoung");
        System.out.println(employee.getName());
        System.out.println(company.getName());
    }
}
