package JavaBasicOop;

class Produk {
    String name;
    int price;

    Produk(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product " + this.name + " price " + this.price;
    }
}

public class ToString {
    public static void main(String[] args) {
        Produk laptob = new Produk("Asus ROG Zephyrus M16 2022", 35_000_000);
        System.out.println(laptob);
    }
}
