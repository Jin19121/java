package ch17.sec12.exam02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("김자바", "남", 85),
                new Student("오해영", "여", 93)
        );

        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );
        
//        Map<String, List<Student>> map = totalList.stream()
//                .collect(Collectors.groupingBy(Student::getSex));


        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));
    }
}
