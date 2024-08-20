package JavaBasicOop;

class TestCallAnotherConstructor {
    String name;
    String address;

    // Utama
    TestCallAnotherConstructor(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Kedua ( Memanggil yang Utama )
    TestCallAnotherConstructor(String name) {
        this(name, null);
    }

    // Ketiga ( Memanggil yang Kedua )
    TestCallAnotherConstructor() {
        this(null);
    }

    public void print() {
        System.out.println("Name " + this.name + ", Address " + this.address);
    }
}

public class CallAnotherConstructor {
    public static void main(String[] args) {
        // Utama ( Parameter lengkap )
        new TestCallAnotherConstructor("Chaeyoung", "South Korea").print();
        // Kedua ( Satu parameter )
        new TestCallAnotherConstructor("Nayeon").print();
        // Ketiga ( Tanpa parameter )
        new TestCallAnotherConstructor().print();
    }
}
