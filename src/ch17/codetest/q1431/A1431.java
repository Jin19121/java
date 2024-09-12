package ch17.codetest.q1431;

import java.util.Arrays;
import java.util.List;

public class A1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

        //가장 많은 캔디 수(max) 구하기
        Integer max = kids.stream()
                .max(Integer::compareTo)
                .get();

        //각 아이들의 캔디에 추가 캔디 더하기
        return kids.stream()
                .map(c -> c + extraCandies)
                //max보다 크거나 같은지 확인
                .map(c -> c > max)
                //결과 List 리턴
                .toList();


    }
}
