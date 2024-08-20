package JavaBasicOop.Util;

import java.lang.reflect.Field;

import JavaBasicOop.AnnotationData.NotBlank;
import JavaBasicOop.Error.*;
import JavaBasicOop.Request.*;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if(loginRequest.getUsername() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new ValidationException("Username cannot be empty");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password cannot be null ");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new ValidationException("Password cannot be empty");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.getUsername() == null) {
            throw new NullPointerException("Username cannot be null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username cannot be empty");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password cannot be null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new BlankException("Password cannot be empty");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields) {
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Cannot access field : " + exception.getMessage());
                }
            }
        }
    }
}