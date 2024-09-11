package ch15.codetest.leetcodes.q1700;

import java.util.*;

public class QueueStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        //두개의 queue만들기
        Queue<Integer> stuQ = new LinkedList<>();
        Queue<Integer> sanQ = new LinkedList<>();

        for (int n : students) {
            stuQ.offer(n);
        }
        for (int n : sandwiches) {
            sanQ.offer(n);
        }

        //첫 값을 빼와서 두개의 출력값이 같다면 그대로 out, 다르면 students에 다시 추가
        int count = 0;
        while (count < students.length) {
            if (stuQ.peek() == null) {
                return 0;
            } else if (stuQ.peek().equals(sanQ.peek())) {
                stuQ.poll();
                sanQ.poll();
                count = 0;
            } else {
                stuQ.offer(stuQ.poll());
                count++;
            }
        }

        int result = stuQ.size();

        return result;
    }
}
