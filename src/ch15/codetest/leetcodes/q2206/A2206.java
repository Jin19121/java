package ch15.codetest.leetcodes.q2206;

import java.util.HashMap;
import java.util.Map;

public class A2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //배역을 전체 탐색, 각 수가 몇개인지 저장(map)
        for (int num : nums) {
            Integer v = map.getOrDefault(num, 0);
            map.put(num, v + 1);
        }

        //map을 전체 탐색해서 value가 홀수인 것이 있으면  return false
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
