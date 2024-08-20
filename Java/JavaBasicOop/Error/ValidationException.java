package JavaBasicOop.Error;

public class ValidationException extends Throwable {
    private String message;
    
    public ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
