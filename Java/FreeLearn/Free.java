package FreeLearn;

class Test<T> {
    private T data;

    Test(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MathUtil{
    public static <T> int arrayLength(T[] arr) {
        return arr.length;
    }
}

public class Free {
    public static void main(String[] args) {
        Test<Double> test = new Test<>(1.0);

        System.out.println(test.getData());

        System.out.println("Integer : " + MathUtil.arrayLength(new Integer[]{1,2,3,4,5,6,7,8,9,10}));

        System.out.println("String : " + MathUtil.arrayLength(new String[]{"Pratama", "Nana", "Mina", ""}));
    }
}
