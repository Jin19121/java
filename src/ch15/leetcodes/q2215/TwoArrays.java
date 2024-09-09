package ch15.leetcodes.q2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int s : nums1) {
            set1.add(s);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int r : nums2) {
            set2.add(r);
        }

        Set<Integer> only1 = new HashSet<>(set1);
        only1.removeAll(set2);

        Set<Integer> only2 = new HashSet<>(set2);
        only2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(only1));
        result.add(new ArrayList<>(only2));

        return result;
    }
}
