package JavaLambda;

import JavaLambda.Interface.SimpleAction;
import JavaLambda.Interface.HelloWorld;
import JavaLambda.Interface.MemberCount;

public class Lambda {
    public static void main(String[] args) {
        // Anonimous class
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Anonimous class -> My name is " + name;
            }
        };
        System.out.println(simpleAction.action("Pratama"));

        // Anonimous class
        HelloWorld hello = new HelloWorld() {
            public String sayHello() {
                return "Anonimous class -> Hello World";
            }
        };
        System.out.println(hello.sayHello());

        // With lambda
        SimpleAction simple = (String name) -> {
            return "Lambda -> Hello " + name;
        };
        System.out.println(simple.action("Chaeyoung"));

        HelloWorld helloLambda = () -> {
            return "Lambda -> Hello World Lambda";
        };
        System.out.println(helloLambda.sayHello());

        // With Lambda
        SimpleAction simpleAc = (name) -> {
            return "Hello " + name;
        };

        System.out.println(simpleAc.action("Chaeyoung"));

        HelloWorld helloWorld = () -> {
            return "Hello World";
        };

        System.out.println(helloWorld.sayHello());

        // With Lambda
        SimpleAction simpleAction2 = (name) -> "Hello " + name;

        System.out.println(simpleAction2.action("Momo Hirai"));

        HelloWorld helloWorld2 = () -> "Hello World";

        System.out.println(helloWorld2.sayHello() + "\n");

        // Try count member -> Generic String
        String[] bp = {"Jenny", "Rose", "Lisa", "Jisso"};
        
        // Anonymous Class
        MemberCount<String> memberCount = new MemberCount<String>() {
            @Override
            public int count(String[] member) {
                return member.length;
            }
        };
        int bpMemberCount = memberCount.count(bp);
        System.out.println("Anonymous -> Member BP " + bpMemberCount);

        // With Lambda
        MemberCount<String> memberCount2 = (String[] member) -> {
            return member.length;
        };
        int bpMemberCount2 = memberCount2.count(bp);
        System.out.println("Lambda -> Member BP " + bpMemberCount2);

        // With Lambda 2
        MemberCount<String> memberCount3 = (String[] member) -> member.length;
        int bpMemberCount3 = memberCount3.count(bp);
        System.out.println("Lambda 2 -> Member BP " + bpMemberCount3);

        // Try count member -> Generic Integer
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Anonymous class
        MemberCount<Integer> numberCount = new MemberCount<Integer>() {
            @Override
            public int count(Integer[] member) {
                return member.length;
            }
        };
        System.out.println("Anonymous -> Numbers " + numberCount.count(numbers));

        // With Lambda
        MemberCount<Integer> numberCount2 = (Integer[] member) -> member.length;
        System.out.println("Lambda -> Numbers " + numberCount2.count(numbers));
    }
}
