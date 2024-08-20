package JavaBasicOop;

class GetterSetterTest {
    private String name;
    private int age;

    // Gette
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge(){
        return age;
    }

    // Setter
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public void printOut() {
        System.out.println("Hello my name is " + this.name + ", i'm " + this.age + " years old");
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        GetterSetterTest getterSetterTest = new GetterSetterTest();
        getterSetterTest.setName("Chaeyoung");
        getterSetterTest.setAge(23);

        System.out.println(getterSetterTest.getName());
        System.out.println(getterSetterTest.getAge());

        getterSetterTest.printOut();
    }
}
