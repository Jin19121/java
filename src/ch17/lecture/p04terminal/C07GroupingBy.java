package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C07GroupingBy {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        //분류 후 결과 list로 새로운 연산
        Map<String, List<Integer>> map = list.stream()
                .collect(
                        Collectors.groupingBy(e -> e % 2 == 0 ? "짝" : "홀"));
        map.forEach((k, v) -> System.out.println(k + ": " + v));


        map.forEach((k, v) -> {
            long count = v.stream()
                    .count();
            System.out.println(k + ": " + count + "개");
        });
        System.out.println();
    }
}
