package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
//        int score = 75;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수> ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("점수가 100-90입니다");
            System.out.println("등급: A");
        } else if (score >= 70) {
            System.out.println("점수가 89-70입니다");
            System.out.println("등급: B");
        } else if (score >= 50) {
            System.out.println("점수 69-50입니다.");
            System.out.println("등급: C");
        } else {
            System.out.println("점수가 50 미만입니다.");
            System.out.println("F: 불합격");
        }
    }
}
