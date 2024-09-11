package ch15.lecture.p08queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // offer 추가
        queue.offer("java");
        queue.offer("css");
        queue.offer("html");
        queue.offer("jsp");
        queue.offer("css"); //중복 상관없음

        // poll 꺼내기
        String item1 = queue.poll();
        String item2 = queue.poll();
        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);

        // 확인하기
        // peek 첫번째 head 원소 확인
        String item3 = queue.peek();
        System.out.println("item3 = " + item3);

        // isEmpty, size
        System.out.println("queue.size() = " + queue.size());
    }
}//leet 1700
