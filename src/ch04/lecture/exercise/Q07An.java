package ch04.lecture.exercise;

import java.util.Scanner;

public class Q07An {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        while (run) {
            System.out.println("""
                    ---------------------------------
                    1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
                    ---------------------------------
                    """);
            System.out.print("선택> ");

            int menu = scanner.nextInt();


            switch (menu) {
                case 1 -> {
                    System.out.print("예금액> ");
                    int money = scanner.nextInt();
                    balance += money;
                }
                case 2 -> {
                    System.out.print("출금액> ");
                    int money = scanner.nextInt();
                    balance -= money;
                }
                case 3 -> System.out.println("잔고> " + balance);
                case 4 -> run = false;
            }
            System.out.println();
        }
    }
}
