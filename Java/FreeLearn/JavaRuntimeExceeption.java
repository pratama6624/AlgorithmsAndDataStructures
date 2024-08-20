package FreeLearn;

import JavaBasicOop.Error.BlankException;

class ValidationExceptionRuntime {
    public static void validateRuntime(AddSomething addSomething) {
        if(addSomething.getSerialNumber() == null) {
            throw new NullPointerException("Serial number is null");
        } else if(addSomething.getSerialNumber().isBlank()) {
            throw new BlankException("Serial number is blank");
        } else if(addSomething.getName() == null) {
            throw new NullPointerException("Name is null");
        } else if(addSomething.getName().isBlank()) {
            throw new BlankException("Name is blank");
        }
    }
}

class AddSomething {
    private String serialNumber;
    private String name;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class JavaRuntimeExceeption {
    public static void main(String[] args) {
        AddSomething something = new AddSomething();
        something.setSerialNumber("T5F4");
        something.setName("Tetra Food");

        ValidationExceptionRuntime.validateRuntime(something);
    }
}
