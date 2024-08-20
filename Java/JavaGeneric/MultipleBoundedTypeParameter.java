package JavaGeneric;

// Bounded Type lebih dari 1, pertama Class sedangkan kedua ke atas hanya untuk interface
class MultipleBoundedType<T extends Number> {
    
    private T number;

    public MultipleBoundedType(T number) {
        this.number = number;
    }

    public T getNumber() {
        return this.number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}

public class MultipleBoundedTypeParameter {
    public static void main(String[] args) {
        MultipleBoundedType<Double> doubleNumber = new MultipleBoundedType<>(10.3);
        System.out.println(doubleNumber.getNumber());
    }
}
