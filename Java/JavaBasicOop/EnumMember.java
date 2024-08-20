package JavaBasicOop;

enum EnumMemberLevel {
    STANDARD("Standard Level Member"),
    PREMIUM("Premium Level Member"),
    VIP("Vip Level Member");

    private String description;

    EnumMemberLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

class Netflix {
    private String name;
    private EnumMemberLevel level;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLevel(EnumMemberLevel level) {
        this.level = level;
    }

    public EnumMemberLevel getMemberLevel() {
        return this.level;
    }
}

public class EnumMember {
    public static void main(String[] args) {
        Netflix pratama = new Netflix();
        pratama.setName("Kukuh Nur Pratama");
        pratama.setLevel(EnumMemberLevel.STANDARD);
        System.out.println(pratama.getName() + ", " + pratama.getMemberLevel());
        System.out.println(pratama.getMemberLevel().getDescription() + "\n");

        Netflix chaeyoung = new Netflix();
        chaeyoung.setName("Son Chaeyoung");
        chaeyoung.setLevel(EnumMemberLevel.VIP);
        System.out.println(chaeyoung.getName() + ", " + chaeyoung.getMemberLevel());
        System.out.println(chaeyoung.getMemberLevel().getDescription());

        // Convert Data Type Enum
        String nayeonLevel = EnumMemberLevel.VIP.name();
        System.out.println("Nayeon Level : " + nayeonLevel);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level + "\n");

        Level[] levelList = Level.values();
        for(var v : levelList) {
            System.out.println(v);
        }
    }
}
