package FreeLearn;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import java.lang.reflect.Field;
import JavaBasicOop.Error.BlankException;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface NotBlank {}

class ValidationUtil {
    public static void validateReflection(Object object) {
        Class anyClass = object.getClass();
        Field[] fields = anyClass.getDeclaredFields();

        for(var field : fields) {
            // validate
            field.setAccessible(true);

            try {
                String value = (String) field.get(object);

                if(value == null || value.isBlank()) {
                    throw new BlankException("Field " + field.getName() + " is blank");
                }
            } catch (IllegalAccessException exception) {
                System.out.println("Field tidak dapat diakses " + exception.getMessage());
            }
        }
    }
}

class RequestUserLog {
    @NotBlank
    private String username;

    @NotBlank
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

public class JavaReflectionValidation {
    public static void main(String[] args) {

        RequestUserLog reqUser = new RequestUserLog();
        reqUser.setUsername("Pratama");
        reqUser.setPassword("youngOne");

        ValidationUtil.validateReflection(reqUser);
    }
}
