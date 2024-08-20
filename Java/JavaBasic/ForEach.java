package JavaBasic;

public class ForEach {
    public static void main(String[] args) {
        // Array
        String[] names = {
            "Nayeon", "Jeongyeon", "Chaeyoung", "Momo", "Sana", "Mina", "Tzuyu", "Dahyun", "Jihyo"
        };

        // for each 
        for(var value : names) {
            System.out.println("Value : " + value);
        }

        System.out.println();

        int[] numbers = new int[] {
            0, 1, 2, 3, 4, 5 , 6, 7, 8, 9
        };

        // for each
        for(int value : numbers) {
            System.out.println("Value : " + value);
        }
    }
}