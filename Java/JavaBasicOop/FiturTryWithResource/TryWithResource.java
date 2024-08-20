package JavaBasicOop.FiturTryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Java_Basic/FiturTryWithResource/README.md"))) {
            while(true) {
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}