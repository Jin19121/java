package ch17.lecture.p03intermediate;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class C06Sorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 1, 9, 0, 10, 1, 3, 7);

        list.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("-Comparator 사용-");
        list.stream()
                .sorted((a, b) -> b - a)//역순
                .forEach(System.out::println);
        System.out.println();

        //reverseOrder가 static 반환
        System.out.println("-Comparator.reverseOrder 사용-");
        list.stream()
                .sorted(reverseOrder())
                .forEach(System.out::println);
    }
}
//747
