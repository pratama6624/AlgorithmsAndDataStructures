package JavaBasicOop;

class Hash {
    String name;
    
    Hash(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 + result;
        return result;
    }

}

public class HashCode {
    public static void main(String[] args) {
        Hash hash = new Hash("Pratama");
        Hash hash2 = new Hash("Pratama");
        System.out.println(hash.hashCode());
        System.out.println(hash2.hashCode());
        System.out.println(hash.hashCode() == hash2.hashCode());
    }
}
