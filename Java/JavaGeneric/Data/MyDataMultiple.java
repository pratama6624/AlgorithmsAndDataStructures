package JavaGeneric.Data;

public class MyDataMultiple<T, U> {
    private T first;
    private U second;

    public MyDataMultiple(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public MyDataMultiple(T first) {
        this.first = first;
    }

    public MyDataMultiple() {}

    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return this.second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "First : " + this.first + ", Second : " + this.second;
    }
}
