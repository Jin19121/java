package ch15.leetcodes.q442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            boolean b = set.add(n);
            if (!b) {
                list.add(n);
            }
        }
        return list;
    }
}
