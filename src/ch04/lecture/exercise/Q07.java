package ch04.lecture.exercise;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 10_0000;
        
        while (run) {
            System.out.println("----------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------");
            System.out.print("선택> ");

            int sel = scanner.nextInt();


            switch (sel) {
                case 1 -> {
                    System.out.print("예금액> ");
                    int in = scanner.nextInt();
                    money += in;
                    System.out.println("잔고> " + money);
                }
                case 2 -> {
                    System.out.print("출금액> ");
                    int out = scanner.nextInt();
                    money -= out;
                }
                case 3 -> System.out.println("잔고> " + money);

                case 4 -> run = false;
                default -> System.out.println("재선택");

            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
//서로 영향을 주게 하려면?