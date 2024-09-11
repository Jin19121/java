package ch17.lecture.p01stream;

import java.util.Random;
import java.util.stream.IntStream;

public class C03Stream {
    public static void main(String[] args) {
        //스트림을 얻는 방식
        IntStream stream = IntStream.range(0, 5); //0~4
        int sum = stream.sum();
        System.out.println("sum = " + sum);

        Random random = new Random();
        IntStream randomStream = random.ints(1, 46);//
        randomStream.distinct()
                .limit(6)
                .forEach(System.out::println);

    }
}
