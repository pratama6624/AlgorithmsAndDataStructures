package JavaBasicOop.Package;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println(this.name + " : " + this.price);
    }
}
