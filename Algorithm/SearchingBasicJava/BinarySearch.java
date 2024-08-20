package Algorithm.SearchingBasicJava;

class SearchingAlgorithm {

    public static int sequenceSearch(int[] numbers, int toFind) {
        System.out.println("TRY");
        for(var i = 0; i < numbers.length; i++) {
            if(numbers[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] numbers, int toFind) {
        int high = numbers.length - 1;
        int low = high;

        if(toFind == numbers[high])
            return high;

        for(var i = 0; i < numbers.length; i++) {
            low = (int) Math.floor(low / 2.0);
            // System.out.println("Step " + i + "\t : \t" + low);
            if(toFind == numbers[low]) {
                return low;
            } else if(toFind >= numbers[low]) {
                low = low + high;
                // System.out.println(low + " | " + high + "  ");
            } else{
                high = low;
                // System.out.println(low + " | " + high + "  ");
            }
        }
        return low;
    }

    public static int binarySearchBinus(int[] numbers, int toFind) {
        int low, mid, high;
        low = 0;
        high = numbers.length - 1;

        System.out.println("Low : " + low);
        while(low <= high) {
            mid = (int) Math.floor((low + high) / 2);
            // System.out.println("Middle\t : \t" + mid);
            if(numbers[mid] == toFind) {
                return mid;
            } else if(numbers[mid] < toFind) {
                low = mid + 1;
                // System.out.println("Low : " + low);
            } else {
                high = mid - 1;
                // System.out.println("High : " + high);
            }
        }
        return -1;
    }

    public static int binarySearchNew(int[] numbers, int toFind) {
        int low, mid, high;
        low = 0;
        high = numbers.length - 1;

        for(var i = 0; i < numbers.length - 1; i++) {
            mid = (int) Math.floor((low + high) / 2.0);
            if(numbers[mid] == toFind) {
                return mid;
            } else if(numbers[mid] < toFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 8, 11, 17, 21, 69, 73, 91, 100};
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] listOfNumbers = new int[200_000_000];

        for(var i = 0; i < 1; i++) {
            for(var j = 0; j < listOfNumbers.length; j++) {
                listOfNumbers[j] = j;
            }
        }

        int x = 91;

        long startTime = System.currentTimeMillis();
        System.out.println("\nSequence Searching with for loop 1 : ");
        System.out.println("Position at : " + SearchingAlgorithm.sequenceSearch(numbers, x));
        long endTime = System.currentTimeMillis();
        
        long startTime1 = System.currentTimeMillis();
        System.out.println("\nBinary Searching with for loop 1 : ");
        System.out.println("Position at : " + SearchingAlgorithm.binarySearch(numbers, x));
        long endTime1 = System.currentTimeMillis();
        
        long startTime2 = System.currentTimeMillis();
        System.out.println("\nnBinary Searching with while loop 1 : ");
        System.out.println("Position at : " + SearchingAlgorithm.binarySearchBinus(numbers, x));
        long endTime2 = System.currentTimeMillis();
        
        long startTime3 = System.currentTimeMillis();
        System.out.println("\nnBinary Searching with while loop 1 : ");
        System.out.println("Position at : " + SearchingAlgorithm.binarySearchBinus(numbers, x));
        long endTime3 = System.currentTimeMillis();

        double totalTime = (endTime - startTime) / 1000.0;
        double totalTime1 = (endTime1 - startTime1) / 1000.0;
        double totalTime2 = (endTime2 - startTime2) / 1000.0;
        double totalTime3 = (endTime3 - startTime3) / 1000.0;
        System.out.println("\nAlgorithm 0 speed : " + String.valueOf(totalTime) + " milisecond");
        System.out.println("Algorithm 1 speed : " + String.valueOf(totalTime1) + " milisecond");
        System.out.println("Algorithm 2 speed : " + String.valueOf(totalTime2) + " milisecond");
        System.out.println("Algorithm 3 speed : " + String.valueOf(totalTime3) + " milisecond");
    }
}