package JavaBasicOop;

interface Fauna {
    public String getName();
    public int getLeg();
    default public boolean canFly() {
        return true;
    }
}

class FaunaAtt {
    String name;
    int leg;
}

class Eagle extends FaunaAtt implements Fauna {

    Eagle(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        return this.name;
    }

    public int getLeg() {
        return this.leg;
    }

    public boolean canFly;
}

class Tiger extends FaunaAtt implements Fauna {

    Tiger(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        return this.name;
    }

    public int getLeg() {
        return this.leg;
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Fauna eagle = new Eagle("Chaeyoung", 2);
        System.out.println("Name : " + eagle.getName() + "\nLegs : " + eagle.getLeg() + "\nCan Fly : " + eagle.canFly());

        System.out.println();

        Fauna tiger = new Tiger("Jojo", 4);
        System.out.println("Name : " + tiger.getName() + "\nLegs : " + tiger.getLeg());
    }
}
