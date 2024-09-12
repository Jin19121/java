package ch17.exercise.q7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("전원우", "개발자"),
                new Member("김민규", "디자이너"),
                new Member("이지훈", "개발자")
        );
        List<Member> developers = list.stream()
                .filter(j -> j.getJob().equals("개발자"))
                .toList();
        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
