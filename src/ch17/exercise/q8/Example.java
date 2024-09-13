package ch17.exercise.q8;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("전원우", "개발자"),
                new Member("김민규", "디자이너"),
                new Member("이지훈", "개발자")
        );
        Map<String, List<Member>> map1 = new HashMap<>();

        //고전적 방법 ?? 뭔가 이상한데 확인좀
        for (Member m : list) {
            String job = m.getJob();
            if (map1.containsKey(job)) {
                List<Member> members = map1.get(job);
                members.add(m);
            } else {
                List<Member> members = new ArrayList<>();
                map1.put(job, members);
                members.add(m);
            }
        }
        System.out.println(map1);

        //stream
        Map<String, List<Member>> groupingMap = list.stream()
                .collect(
                        Collectors.groupingBy(Member::getJob)
                );

        System.out.println("stream");
        System.out.println("[개발자]");
        List<Member> devList = groupingMap.get("개발자");
        devList.forEach(System.out::println);

        System.out.println("[디자이너]");
        List<Member> desList = groupingMap.get("디자이너");
        desList.forEach(System.out::println);

        System.out.println();
        //answer stream
        System.out.println("stream2");
        Map<String, List<Member>> map2 = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));
        System.out.println(map2);
    }
}
