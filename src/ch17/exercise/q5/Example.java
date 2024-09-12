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
        list.stream()
                .filter(e -> e.contains("java") || e.contains("Java"))
                .forEach(System.out::println);
        //api 참고
        //lowerCase 참고
    }
}
