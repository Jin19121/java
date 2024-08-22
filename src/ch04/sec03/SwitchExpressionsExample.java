package ch04.sec03;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'a';

        System.out.println("등급 : " + grade);
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수");
                break;
            case 'B':
            case 'b':
                System.out.println("일반");
                break;
            default:
                System.out.println("손님");
                break;
        }
    }
}
