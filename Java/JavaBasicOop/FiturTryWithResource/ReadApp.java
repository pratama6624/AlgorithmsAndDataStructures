package JavaBasicOop.FiturTryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                new FileReader("Java_Basic/FiturTryWithResource/README.md")
            );

            while(true) {
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error reading file : " + throwable.getMessage());
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                    System.out.println("Success closed file");
                } catch (IOException ioException) {
                    System.out.println("Error closed file : " + ioException.getMessage());
                }
            }
        }
    }
}
