package JavaBasicOop;

import JavaBasicOop.Error.*;
import JavaBasicOop.Request.*;
import JavaBasicOop.Util.*;;

public class Exception {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "justforfun");

        try{
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            System.out.println("Will always run and is used to close databases");
        }


        LoginRequest loginRequest2 = new LoginRequest("", "justforfun");
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
