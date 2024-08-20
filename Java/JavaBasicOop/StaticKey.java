package JavaBasicOop;

import JavaBasicOop.Util.MathUtil;

class VersionControl {
    public static final String APPLICATION = "Java";
    public static final String VERSION = "1.1.1";

    public static final int PROSESSORS;
    public static final long RAM;

    static {
        System.out.print("CORE : ");
        PROSESSORS = Runtime.getRuntime().availableProcessors();
    }

    static {
        System.out.println("RAM : ");
        RAM = Runtime.getRuntime().freeMemory();
    }
}

class Country {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class City {
        private String name;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Error static cannot be accessed from the outer class
        // public String getCountry() {
            // return Country.this.name;
        // }
    }
}

public class StaticKey {
    public static void main(String[] args) {
        System.out.println(VersionControl.APPLICATION);
        System.out.println(VersionControl.VERSION);
        System.out.println(VersionControl.PROSESSORS);
        System.out.println(MathUtil.sumOf(1, 2, 3));
        System.out.println(MathUtil.sumOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Country.City city = new Country.City();
        city.setName("South Korea");

        System.out.println(city.getName());
    }
}
