package JavaBasicOop;

class Shape {
    void getCorner() {
        System.out.println(8);
    }
}

class Rectangle extends Shape {
    // Overriding of parent class
    void getCorner() {
        System.out.println(4);
    }

    // Akan mengembalikan fungsi asli dari class parent
    // Will return the original function of the parent class
    void getCornerFromParent() {
        super.getCorner();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        new Rectangle().getCorner();
        new Rectangle().getCornerFromParent();
    }
}
