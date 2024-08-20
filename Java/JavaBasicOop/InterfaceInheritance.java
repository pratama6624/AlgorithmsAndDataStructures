package JavaBasicOop;

interface HasBrand {
    public String getBrand();
}

interface CarX extends HasBrand {
    public void drive();
    public int getTire();
}

class Honda implements CarX {
    String brand;
    String type;
    int tire;

    Honda(String brand, String type, int tire) {
        this.brand = brand;
        this.type = type;
        this.tire = tire;
    }

    public String getBrand() {
        return this.brand;
    }

    public void drive() {
        System.out.println("Drive " + this.brand + " " + this.type);
    }

    public int getTire() {
        return this.tire;
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        CarX hondaCivic = new Honda("Honda", "Civic Type-R", 4);
        System.out.println(hondaCivic.getBrand());
        hondaCivic.drive();
        System.out.println(hondaCivic.getTire());
    }    
}
