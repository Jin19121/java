package ch04.lecture.p02switch;

public class C12SwitchExpression {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;

        String g = switch (n) {
            case 1 -> "일";
            case 2 -> {
                //여러 명령문 작성 후 값 산출 시, 마지막에 yield문 작성
                String a = "이";
                String b = "second";
                yield a + b;
            }
            case 3 -> "삼";
            default -> "etc";
        };
        System.out.println(g);

    }
}
