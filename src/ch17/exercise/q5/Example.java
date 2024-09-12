package ch17.exercise.q5;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expression",
                "Java8 supports lambda Expression"
        );

        System.out.println("-Stream API-");
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);

        
        System.out.println("-고전적 반복문-");
        for (String item : list) {
            if (item.toLowerCase().contains("java")) {
                System.out.println(item);
            }
        }
    }
}
