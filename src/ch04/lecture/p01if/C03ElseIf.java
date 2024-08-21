package ch04.lecture.p01if;

public class C03ElseIf {
    public static void main(String[] args) {
        System.out.println(1);
        if (false) {
            System.out.println(2);
            System.out.println(3);
        } else if (true) { //앞선 if가 false일 때 실행, if가 true이면 else if는 실행되지 않음
            System.out.println(4);
            System.out.println(5);
        } else {
            System.out.println(6);
            System.out.println(7);

        }

        System.out.println(8);

    }
}
