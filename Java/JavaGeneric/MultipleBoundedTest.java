package JavaGeneric;

public class MultipleBoundedTest {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager()); // Error karena tidak implement interface CanSayHay
        Data<VicePresident> vpData = new Data<>(new VicePresident());

        System.out.println(vpData.getData());
    }

    public static interface CanSayHay {
        void sayHay(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Manager implements CanSayHay {
        @Override
        public void sayHay(String name) {
            System.out.println("Hay " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHay> {
        private T data;

        Data(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
