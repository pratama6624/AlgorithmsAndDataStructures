package JavaBasicOop;

interface Car {
    public void drive();
    public int getTire();
}

class McLaren implements Car {
    String series;
    int tire;

    McLaren(String series, int tire) {
        this.series = series;
        this.tire = tire;
    }

    public void drive() {
        System.out.println("Drive McLaren " + this.series);
    }

    public int getTire() {
        return this.tire;
    }
}

public class Interface {
    public static void main(String[] args) {
        McLaren mclaren650S = new McLaren("650S", 4);
        mclaren650S.drive();
        System.out.println(mclaren650S.getTire());
    }
}
