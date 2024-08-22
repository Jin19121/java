package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        System.out.println("등급> " + grade);
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원");
            case 'B', 'b' -> System.out.println("일반 회원");
            default -> System.out.println("손님");
        }
    }
}
