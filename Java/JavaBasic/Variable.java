package JavaBasic;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Pratama";

        String nim;
        nim = "411222054";

        short age;
        age = 24;

        String address = "Indonesia";

        System.out.println("name : " + name);
        System.out.println("nim : " + nim);
        System.out.println("age : " + age);
        System.out.println("address : " + address);

        // name is change
        name = "Pratama One";
        System.out.println("new name : " + name);
    }
}
