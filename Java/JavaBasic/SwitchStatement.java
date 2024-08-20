package JavaBasic;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch case
        var value = "C";

        switch(value) {
            case "A" :
                System.out.println("A");
                break;
            case "B" :
                System.out.println("B");
                break;
            case "C" :
                System.out.println("C");
                break;
            case "D" :
                System.out.println("D");
                break;
            default :
                System.out.println("Maybe you are in the wrong direction");
        }

        // // switch with lambda - Version Java >= 14
        // switch(value) {
        //     case "A" -> System.out.println("A");
        //     case "B" -> System.out.println("B");
        //     case "C" -> System.out.println("C");
        //     case "D" -> System.out.println("D");
        //     default -> {
        //         System.out.println("Maybe you are in the wrong direction");
        //     }
        // }
        

        // switch without yield
        String out;
        switch(value) {
            case "A" :
                out = "A";
                break;
            case "B" :
                out = "B";
                break;
            case "C" :
                out = "C";
                break;
            case "D" :
                out = "D";
                break;
            default :
                out = "Maybe you are in the wrong direction";
        }
        System.out.println("\nOut : " + out + "\n");


        // // switch with yield - Version Java >= 14
        // String outWithYield = switch(value) {
        //     case "A":
        //         yield "A";
        //     case "B":
        //         yield "B";
        //     case "C":
        //         yield "C";
        //     case "D":
        //         yield "D";
        //     default:
        //         yield "Maybe you are in the wrong direction";
        // };
        // System.out.println("Out with yield : " + outWithYield + "\n");
    }
}
