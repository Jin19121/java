package ch04.lecture.p02switch;

public class C09SwitchExpression {
    public static void main(String[] args) {
        //switch expression
//        int a = 3;
//        int b = a+5;
//        int c = a;

        //switch expression 사용

        String g = "p";
        System.out.print(g);

        String message = switch (g) {
            case "O", "o" -> "Outstanding";
            case "E", "e" -> "Exceeds Expectation";
            case "P", "p" -> "Poor";
            default -> "";
        };
        System.out.println("stands for " + message);
    }
}
