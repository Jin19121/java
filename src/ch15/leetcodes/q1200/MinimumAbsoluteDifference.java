package ch15.leetcodes.q1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i + 1] - arr[i];

            List<Integer> minus = new ArrayList<>();
            minus.add(min);
            if (minus.get(0) <= min) {
                min = minus.get(i);
                for (int j = 0; j < i; j++) {
                    result.get(j).add(arr[i]);
                    result.get(j).add(arr[i + 1]);
                }

            }
        }


        return result;
    }
}
