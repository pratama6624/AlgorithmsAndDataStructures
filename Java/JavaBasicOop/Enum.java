package JavaBasicOop;

enum Level {
    STANDARD, PREMIUM, VIP;
}

class Customer {
    private String name;
    private Level level;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}

public class Enum {
    public static void main(String[] args) {
        Customer pratama = new Customer();
        pratama.setName("Kukuh Nur Pratama");
        pratama.setLevel(Level.STANDARD);

        System.out.println("Name : " + pratama.getName());
        System.out.println("Level : " + pratama.getLevel());

        System.out.println();

        Customer chae = new Customer();
        chae.setName("Son Chaeyoung");
        chae.setLevel(Level.VIP);

        System.out.println("Name : " + chae.getName());
        System.out.println("Level : " + Level.VIP);
    }
}
