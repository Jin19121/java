package ch15.codetest.leetcodes.q1512;

import java.util.HashMap;
import java.util.Map;

public class IdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            if (val != 1) {
                sum += val * (val - 1) / 2;
            }
        }
        return sum;
    }
}
