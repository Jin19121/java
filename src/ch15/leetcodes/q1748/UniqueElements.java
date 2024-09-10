package ch15.leetcodes.q1748;

import java.util.HashMap;
import java.util.Map;

public class UniqueElements {
    public int sumOfUnique(int[] nums) {
        // 배열 전체 탐색 후 (수, 몇개)
        // map을 전체 탐색해서 value가 1인 key들의 합

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(i, map.getOrDefault(i, 0));
        }
        if (map.containsValue(1))


            return 0;
        return 0;
    }
}
