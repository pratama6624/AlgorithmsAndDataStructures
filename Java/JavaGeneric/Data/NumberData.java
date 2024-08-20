package JavaGeneric.Data;

// Bounded Type Parameter
public class NumberData<T extends Number> {
    
    private T number;

    public NumberData(T number) {
        this.number = number;
    }

    public T getNumber() {
        return this.number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
