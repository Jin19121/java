package ch04.sec02;

import java.util.Random;
import java.util.Scanner;

public class IfDiceExample {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("주사위는 던져졌다.> ");
//        int num = scanner.nextInt();

        int num = (int) ((Math.random() * 6) + 1);
        System.out.println("점수: " + num);

        if (num == 1) {
            System.out.println("1보 전진");
        } else if (num == 2) {
            System.out.println("2보 전진");
        } else if (num == 3) {
            System.out.println("3보 전진");
        } else if (num == 4) {
            System.out.println("4보 전진");
        } else if (num == 5) {
            System.out.println("5보 전진");
        } else if (num == 6) {
            System.out.println("6보 전진");
        } else {
            System.out.println("자넨 주사위를 던지지 않았군.");
        }
        //Random 클래스 사용
        Random random = new Random();
        int j = random.nextInt(6) + 1;
        System.out.println("j = " + j);
    }
}
