package ch15.codetest.leetcodes.q1700;

import java.util.LinkedList;
import java.util.Queue;

public class A1700 {
    public int countStudents(int[] num1, int[] num2) {
        Queue<Integer> students = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();

        for (int n : num1) {
            students.offer(n);
        }

        return 0;
    }
}
