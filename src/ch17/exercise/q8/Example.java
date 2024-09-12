package ch17.exercise.q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("전원우", "개발자"),
                new Member("김민규", "디자이너"),
                new Member("이지훈", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(
                        Collectors.groupingBy(Member::getJob)
                );

        System.out.println("[개발자]");
        List<Member> devList = groupingMap.get("개발자");
        devList.forEach(System.out::println);

        System.out.println("[디자이너]");
        List<Member> desList = groupingMap.get("디자이너");
        desList.forEach(System.out::println);
    }
}
