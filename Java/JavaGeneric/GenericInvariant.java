package JavaGeneric;

import JavaGeneric.Data.MyDataNonGeneric; // Non Generic
import JavaGeneric.Data.MyData; // Generic

// Invariant means it can't change shape
// Either from Object to String Integer or vice versa
public class GenericInvariant {
    public static void main(String[] args) {
        // Non Generic
        MyDataNonGeneric dataNonGeneric = new MyDataNonGeneric();
        dataNonGeneric.setName("Pratama");
        dataNonGeneric.setCountry("Indonesian");

        System.out.println("String : " + dataNonGeneric.getName());

        MyDataNonGeneric fromStringToObject = dataNonGeneric;

        System.out.println("To Object : " + fromStringToObject.getName());

        // With Generic
        MyData<String> dataGeneric = new MyData<>("Chaeyoung");
        // MyData<Object> dataObject = dataGeneric; // Error

        MyData<Integer> dataGenericInteger = new MyData<Integer>(1000);
        // MyData<Object> dataObject1 = dataGenericInteger; // Error

        MyData<Object> dataObject2 = new MyData<Object>("Riko");
        // MyData<String> toStringFromObject = dataObject2; // Error
    }
}
