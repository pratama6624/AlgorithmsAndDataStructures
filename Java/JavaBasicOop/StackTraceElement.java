package JavaBasicOop;

public class StackTraceElement {
    public static void main(String[] args) {
        // System.out.println("For details of the error");

        // try{
        //     String[] names = {"Pratama", "Chaeyoung", "Leo"};
        //     System.out.println(names[10]);
        // } catch (Throwable throwable) {
        //     java.lang.StackTraceElement[] stackTraces = throwable.getStackTrace();
        //     throwable.printStackTrace();
        // }

        // Graded Error
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    // Error Bertingkat
    public static void sampleError() {
        try {
            String[] namesOf = {"Pratama", "Chaeyoung", "Rere"};
            System.out.println(namesOf[20]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
