package ch15.codetest.leetcodes.q2206;

import java.util.HashMap;
import java.util.Map;

public class DivideArray {
    public boolean divideArray(int[] nums) {
        // 배열을 전체 탐색해서 각 수가 몇 개인지 저장
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        boolean result = true;
        //map을 전체 탐색해서 value가 홀수인 것이 있으면 return false
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer val = entry.getValue();
            if (val % 2 == 1) {
                result = false;
            }
        }

        return result;
    }
}