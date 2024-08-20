package JavaBasicOop.Request;

import JavaBasicOop.AnnotationData.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;
    
    @NotBlank
    private String password;

    @NotBlank
    private String contactPerson;

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

    public String getContactPerson() {
        return this.contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
