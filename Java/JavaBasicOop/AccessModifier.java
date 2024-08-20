package JavaBasicOop;

import JavaBasicOop.Package.*;

public class AccessModifier {
    public static void main(String[] args) {
        /*
            4 Modifier :
            -----------------------------------------------------------------
            modifier    |   Class   |   Package   |   Subclass   |   World
            public      |     Y     |      Y      |      Y       |     Y
            protected   |     Y     |      Y      |      Y       |     N
            no modifier |     Y     |      Y      |      N       |     N
            privete     |     Y     |      N      |      N       |     N
        */

        Product product1 = new Product("Book", 100000);
        product1.print();
    }
}
