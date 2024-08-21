package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 89;
        if (score >= 90) {
            System.out.println("점수가 90 이상입니다.");
            System.out.println("등급: A");
        }
        if (score < 90) {
            System.out.println("점수가 90 미만입니다.");
            System.out.println("등급: B");
        }
        ;

    }
}
