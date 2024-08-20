package FreeLearn.JavaLambda;

import FreeLearn.JavaLambda.Interface.MyFunction;

public class Function {
    public static void main(String[] args) {
        MyFunction<Integer, String> countArray = new MyFunction<Integer, String>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };

        String myName = "Kukuh Nur Pratama";
        System.out.println("Nama " + myName + " memiliki panjang " + countArray.apply(myName) + " Karakter");

        MyFunction<Boolean, String> isLong = (value) -> {
            return value.length() > 5;
        };
       
        String herName = "Son Chaeyoung";
        System.out.println("Nama " + herName + " adalah nama yang " + (isLong.apply(herName) ? "panjang" : "pendek"));
    }
}
