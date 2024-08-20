package JavaGeneric.Data;

// Bounded Type Parameter
public class StringData<T extends String> {
    
    private T stringData;

    public StringData(T stringData) {
        this.stringData = stringData;
    }

    public T getStringData() {
        return this.stringData;
    }

    public void setStringData(T stringData) {
        this.stringData = stringData;
    }
}
