package ch15.codetest.leetcodes.q2006;

import static java.lang.Math.abs;

public class AbsolutePairs {
    public int countDifference(int[] nums, int k) {
        int count = 0;
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (Math.abs(nums[b] - nums[a]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
