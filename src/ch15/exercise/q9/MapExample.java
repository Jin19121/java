package ch15.exercise.q9;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 95);
        map.put("hong", 85);
        map.put("white", 92);

        String maxName = null;
        int maxScore = 0;
        int totalScore = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();

            totalScore += score;

            if (maxScore < score) {
                maxScore = score;
                maxName = name;
            }
        }

        int avg = totalScore / map.size();

        System.out.println("avg = " + avg);
        System.out.println("maxScore = " + maxScore);
        System.out.println("maxName = " + maxName);
    }
}
