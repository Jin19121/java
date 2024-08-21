package ch04.lecture.p02switch;

public class C11SwitchExpression {
    public static void main(String[] args) {
        //1~3 정수
        int n = (int) (Math.random() * 3) + 1;

        String grade = switch (n) {
            case 1 -> "일";
            case 2 -> "이";
            case 3 -> "삼";
            default -> "사";
        };

        System.out.println(grade + "등급");
        //print에도 넣을 수 있음
    }
}
