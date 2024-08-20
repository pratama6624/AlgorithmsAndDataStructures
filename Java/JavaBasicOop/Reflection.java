package JavaBasicOop;

import JavaBasicOop.Request.CreateUserRequest;
import JavaBasicOop.Util.ValidationUtil;

public class Reflection {
    public static void main(String[] args) {
        
        CreateUserRequest user = new CreateUserRequest();
        user.setUsername("Pratama");
        user.setPassword("scyoung123");
        user.setContactPerson("085162716624");

        ValidationUtil.validationReflection(user);
    }
}
