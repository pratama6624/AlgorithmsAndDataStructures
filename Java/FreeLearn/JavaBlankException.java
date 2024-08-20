package FreeLearn;

import JavaBasicOop.Error.BlankException;

class ValidationBlankExceptionUtil {
    public static void validateBlank(AddData addData) {
        if(addData.getName() == null) {
            throw new NullPointerException("Name is null");
        } else if(addData.getName().isBlank()) {
            throw new BlankException("Name is blank");
        } else if(addData.getCountry() == null) {
            throw new NullPointerException("Country is null");
        } else if(addData.getCountry().isBlank()) {
            throw new BlankException("Country is blank");
        }
    }
}

class AddData {
    private String name;
    private String country;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public class JavaBlankException {
    public static void main(String[] args) {
        AddData data = new AddData();
        data.setName("Chaeyoung");
        data.setCountry("South Korea");

        ValidationBlankExceptionUtil.validateBlank(data);
    }
}
