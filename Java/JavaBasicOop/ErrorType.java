package JavaBasicOop;

import JavaBasicOop.Error.DatabaseError;

// Error only used for fatal errors
public class ErrorType {
    public static void main(String[] args) {
        connectDatabase("pratama", null);
    }

    public static void connectDatabase(String username, String password) {
        if(username == null || password == null) {
            throw new DatabaseError("Failed to connect to database");
        }
    }
}
