package ch17.exercise.q6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Hong", 30),
                new Member("Shin", 40),
                new Member("Kim", 26)
        );

        Stream<Member> memberStream = list.stream();
        IntStream ageStream = memberStream.mapToInt(m -> m.getAge());
        double avg = ageStream.average().getAsDouble();
        System.out.println("avg = " + avg);

        double avg2 = list.stream()
                .mapToInt(m -> m.getAge())
                .average()
                .getAsDouble();
        System.out.println("avg2 = " + avg2);
    }
}
