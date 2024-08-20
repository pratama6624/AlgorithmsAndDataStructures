package FreeLearn;

class ValidationExceptionStandart extends Throwable {
    private String message;

    ValidationExceptionStandart(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

class ValidationStandart {
    public static void validateException(LoginRequest loginRequest) throws ValidationExceptionStandart {
        if(loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.getUsername().isBlank()) {
            throw new ValidationExceptionStandart("Username is blank");
        } else if(loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.getPassword().isBlank()) {
            throw new ValidationExceptionStandart("Password is blank");
        }
    }
}

class LoginRequest {
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class JavaValidationStandart {
    public static void main(String[] args) {
        LoginRequest user = new LoginRequest();
        user.setUsername("Chaeyoung");
        user.setPassword("Son6624");

        try {
            ValidationStandart.validateException(user);
        } catch(ValidationExceptionStandart exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }
}
