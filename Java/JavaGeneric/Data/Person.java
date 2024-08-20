package JavaGeneric.Data;

public class Person implements Comparable<Person> {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getAddress() {
        return this.address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    // Override method compareTo di interface Comparable
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Name : " + name + ", address : " + address;
    }
}
