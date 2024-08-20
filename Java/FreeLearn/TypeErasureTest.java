package FreeLearn;

class Data<T> {
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public Data() {}

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Mahasiswa {
    private String name;
    private String nim;
    private String prodi;
    private int age;

    public Mahasiswa(String name, String nim, String prodi, int age) {
        this.name = name;
        this.nim = nim;
        this.prodi = prodi;
        this.age = age;
    }

    public Mahasiswa() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", nim : " + nim + ". prodi : " + prodi + ", age : " + age;
    }
}

public class TypeErasureTest {
    public static void main(String[] args) {
        Data data = new Data(); // Tanpa informasi tipe data genericnya
        data.setData("Chaeyoung");
        Data<String> data1 = new Data<>("Pratama");

        System.out.println(data.getData());
        System.out.println(data1.getData());

        // rubah data
        Data<String> data2 = (Data<String>) data;
        String stringData2 = data2.getData();

        System.out.println(stringData2);

        // Error tidak terlihat
        Data<Integer> data3 = (Data<Integer>) data;
        // Integer integerData3 = data3.getData(); // Error

        // System.out.println(integerData3); // Error

        Data<Mahasiswa> mahasiswa = new Data<>(new Mahasiswa("Pratama", "KNP29051999", "Tehnik Informatika", 23));
        System.out.println(mahasiswa.getData().toString());

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setName("Chaeyoung");
        mahasiswa1.setNim("SCY29052000");
        mahasiswa1.setProdi("Seni Music");
        mahasiswa1.setAge(22);
        Data<Mahasiswa> mahasiswa2 = new Data(mahasiswa1);
        System.out.println(mahasiswa2.getData().toString());
    }
}
