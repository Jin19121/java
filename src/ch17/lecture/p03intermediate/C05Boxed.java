package ch17.lecture.p03intermediate;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05Boxed {
    public static void main(String[] args) {
        //Stream, IntStream, DoubleStream, LongStream
        //참조타입과 기본타입원소 Stream이 가지는 메소드가 차이가 있어서 서로 변환해가며 사용

        //참조타입원소 Stream을 기본타입원소 Stream으로
        //mapToInt, mapToDouble, mapToLong

        //기본타입원소 Stream을 참조타입원소 Stream으로
        // :boxed, mapToObj

        //ex) 기본->참조
        int[] nums = {100, 1000, 10, 50, 500};
        Arrays.stream(nums)
                .boxed()
                .forEach(System.out::println);

        Arrays.stream(nums)
                .mapToObj(n -> n + "원")
                .forEach(System.out::println);
    }
}
//743