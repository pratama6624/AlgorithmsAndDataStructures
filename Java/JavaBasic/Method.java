package JavaBasic;

public class Method {
    public static void main(String[] args) {
        // Method or Function
        // is a block oof code that will run if we call it

        // 1. Method (we call it)
        sayHay();

        // 2. Method parameter
        // we are sending the data type when we call the method and that data type will be used in the method
        sayHello("Pratama");

        // 3. Method return value
        // a method that returns a value when we call it
        int divide = divideOf(10, 2);
        System.out.println("divide of (10, 2) : " + divide);

        // 4. Variable argument
        // send parameters whose number is more than 1 and whose number is unknown
        // if more than 1 parameter then the argument variable must be behind
        int sum = sumOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Penjumlahan dari 1 sampai 9 : " + sum);

        // 5. Method Overloading
        // rewrite the method with different parameters
        sayHay("Pratama");
    }

    // 1. Method or Function
    public static void sayHay() {
        System.out.println("Hay, this is method");
    }

    // 2. Method with parameter
    public static void sayHello(String name) {
        System.out.println("Hello, welcome " + name);
    }

    // 3. Method return value
    public static int divideOf(int parameter1, int parameter2) {
        return parameter1 / parameter2;
    }

    // 4. Method variable argument
    public static int sumOf(int... values) {
        int sum = 0;
        for(var value : values) {
            sum += value;
        }
        return sum;
    }

    // 5. Method Overloading for sayHay
    public static void sayHay(String name) {
        System.out.println("Hay, this is method " + name);
    }
}
