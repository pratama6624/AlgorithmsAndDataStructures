package JavaBasicOop;

class SNS {
    String name;
}

class IG extends SNS {
    final public String getName() {
        return this.name;
    }
}

class FakeIG extends IG {
    // Override error because method in parent class is final
    // @Override
    // public String getName() {
    //     return "Fake " + this.name;
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        
    }
}
