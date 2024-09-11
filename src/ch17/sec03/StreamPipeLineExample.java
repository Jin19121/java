package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("DK", 27),
                new Student("Hoshi", 28),
                new Student("Vernon", 27)
        );

        //방법1 연결 연결~
//        //1. stream 만들기
//        Stream<Student> stream = list.stream();
//        //2. 중간 연산
//        IntStream stream1 = stream.mapToInt(student ->student.getScore());
//        //3. 최종 연산
//        OptionalDouble average = stream1.average();
//        //나머지...
//        double avg = average.getAsDouble();
//        System.out.println("avg = " + avg);

        //방법2 한번에 처리하기 method chaining
        double avg = list.stream()//1. 스트림 만들기
                .mapToInt(student -> student.getScore())//2. 중간연산
                .average()//3. 최종연산
                .getAsDouble();//기타 등등
        System.out.println("평균나이 = " + avg);
    }
}
