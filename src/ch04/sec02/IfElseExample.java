package ch04.sec02;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
//        int score = 85;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수> ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("합격");
            System.out.println("점수가 90점 이상입니다.");
        } else {
            System.out.println("불합격");
            System.out.println("점수가 90점 미만입니다.");
        }

    }
}
