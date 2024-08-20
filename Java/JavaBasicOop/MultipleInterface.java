package JavaBasicOop;

interface IsMaintenance {
    public boolean isMaintenance();
}

interface Mobil {
    public void drive();
    public int getTier();
    public String getBrand();
}

class HondaCar implements Mobil, IsMaintenance{
    public int tier;
    public String seri;
    public String brand;

    HondaCar(String brand, String seri, int tier) {
        this.brand = brand;
        this.seri = seri;
        this.tier = tier;
    }

    public void drive() {
        System.out.println("I'm driving " + this.seri);
    }

    public int getTier() {
        return this.tier;
    }

    public String getBrand() {
        return this.brand;
    }

    public boolean isMaintenance() {
        return false;
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Mobil civic = new HondaCar("Honda", "Civic", 4);
        civic.drive();
        System.out.println("Tier : " + civic.getTier());
        System.out.println("Brand : " + civic.getBrand());

        System.out.println();

        Mobil mobilio = new HondaCar("Honda", "Mobilio", 4);
        mobilio.drive();
        System.out.println("Tier : " + mobilio.getTier());
        System.out.println("Brand : " + mobilio.getBrand());
    }
}
