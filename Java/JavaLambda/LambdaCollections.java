package JavaLambda;

import java.util.List;
// for foreach
import java.util.function.Consumer;
// for remove if
import java.util.function.Predicate;
import java.util.ArrayList;
// for map
import java.util.Map;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class LambdaCollections {
    public static void main(String[] args) {

        // List Looping Foreach
        List<String> names = List.of("Pratama", "Rafa", "Raka");

        // for loop
        for(var value : names) {
            System.out.println(value);
        }

        System.out.println(); // new line

        // for each Anonymous class -> Consumer
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        System.out.println(); // new line

        // Lambda
        names.forEach(value -> System.out.println(value));
        System.out.println();

        // Lambda Method Reference
        names.forEach(System.out::println);

        System.out.println(); // new line

        // ---------------------------------------------------------------------------------------

        // remove if
        List<String> shortName = new ArrayList<>();
        shortName.addAll(List.of("Nayeon", "Chaeyoung", "Momo", "Sana", "Tzuyu", "Mina", "Dahyun"));

        // Anonymous for remove if -> Perdicate
        shortName.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });
        System.out.println(shortName + "\n");

        // Lambda Collection
        shortName.removeIf(value -> value.length() > 4);
        System.out.println(shortName + "\n");

        // ---------------------------------------------------------------------------------------

        // Map foreach -> BiConsumer
        Map<String, String> name = new HashMap<>();
        name.put("First", "Kukuh");
        name.put("Middle", "Nur");
        name.put("Last", "Pratama");

        // for loop
        for(var value : name.entrySet()) {
            System.out.println(value.getKey() + " -> " + value.getValue());
        }

        System.out.println(); // new line

        // Anonymous class map foreach -> BiConsumer
        name.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " -> " + value);
            }
        });

        System.out.println(); // new line

        // Lambda Collection
        name.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
