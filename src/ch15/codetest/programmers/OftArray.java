package ch15.codetest.programmers;

import java.util.HashMap;
import java.util.Map;

public class OftArray {
    public int solution(int[] array) {

        //(요소, 회수)인 map 생성
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        //value가 최대값인 entry의 key값 구하기 (sort compare 재정의로 되려나)

        //value max가 중복이면 return -1


        return 0;
    }
}
