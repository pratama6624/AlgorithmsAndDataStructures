package JavaBasicOop;

class EqualClass {
    String name;
    int price;
    String season;

    EqualClass(String name, int price, String season) {
        this.name = name;
        this.price = price;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Price : " + this.price + ", Season : " + this.season;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if(this == o) return true;
    //     if(o == null || getClass() != o.getClass()) return false;

    //     EqualClass same = (EqualClass) o;
    //     if()
    // }
}

public class EqualsOverride {
    public static void main(String[] args) {
        EqualClass same = new EqualClass("Asus Rog Jersey", 190_000, "Summer");
        EqualClass same2 = new EqualClass("Asus Rog Jersey", 190_000, "Summer");
        EqualClass same3 = new EqualClass("Aorus Pro Jersey", 190_000, "Fall");

        System.out.println(same.equals(same));
        System.out.println(same.equals(same2));

        System.out.println(same);
    }
}
