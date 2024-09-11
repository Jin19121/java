package ch15.lecture.p07stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        // STACK(LIFO, last in first out)

        Stack<String> stack = new Stack<>();

        // push: 원소추가
        stack.push("java");
        stack.push("css");
        stack.push("react");
        stack.push("vue");
        stack.push("sql");
        stack.push("css");

        // pop: 원소 꺼내기
        String item1 = stack.pop();
        System.out.println("item1 = " + item1);
        String item2 = stack.pop();
        System.out.println("item2 = " + item2);

        // 확인하기
        // size: 원소 수
        int size = stack.size();
        System.out.println("size = " + size);
        // peek: 마지막 top 원소 확인
        String item3 = stack.peek();
        System.out.println("item3 = " + item3);//꺼낸 게 아니라 사이즈 변화 없음
        System.out.println("stack.size() = " + stack.size());
    }
}
//679 680
//leet