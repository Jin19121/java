package ch06.Exercise.q20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ApplicationT {
    public static void main(String[] args) {
        AccountT[] accountList = new AccountT[100];
        int customerNumber = 0;

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        while (run) {
            System.out.println("""
                    --------------------------------------------------
                     1. 계좌 생성 | 2. 목록 | 3. 예금 | 4. 출금 | 5. 종료
                    --------------------------------------------------""");
            System.out.print("선택> ");
            int select = scanner.nextInt();

            switch (select) {
                case 1 -> {
                    System.out.println("계좌 생성");
                    System.out.print("계좌 번호: ");
                    String no = scanner.next();
                    System.out.print("계좌주: ");
                    String name = scanner.next();
                    System.out.print("초기 입금액: ");
                    int balance = scanner.nextInt();

                    AccountT account = new AccountT(no, name, balance);
                    accountList[customerNumber] = account;
                    customerNumber++;

                    System.out.println();
                    System.out.println("가입을 축하드립니다.");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("목록");
                    for (int i = 0; i < customerNumber; i++) {
                        String no = accountList[i].getNo();
                        String name = accountList[i].getName();
                        int balance = accountList[i].getBalance();
                        System.out.println(STR."\{no}   \{name}   \{balance}");
                    }
                }
                case 3 -> {
                    System.out.println("예금");
                    System.out.print("계좌번호: ");
                    String no = scanner.next();
                    System.out.print("예금액: ");
                    int money = scanner.nextInt();

                    for (int i = 0; i < customerNumber; i++) {
                        String n = accountList[i].getNo();
                        if (no.equals(n)) {
                            int current = accountList[i].getBalance();
                            accountList[i].setBalance(current + money);
                            System.out.println(STR."총 \{accountList[i].getBalance()} 원 저금하셨습니다.");
                            System.out.println();
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("출금");
                    System.out.print("계좌번호: ");
                    String no = scanner.next();
                    System.out.print("출금액: ");
                    int money = scanner.nextInt();

                    for (int i = 0; i < customerNumber; i++) {
                        String n = accountList[i].getNo();
                        if (no.equals(n)) {
                            int current = accountList[i].getBalance();
                            accountList[i].setBalance(current - money);
                            System.out.println(STR."총 \{accountList[i].getBalance()} 원 저금하셨습니다.");
                            System.out.println();
                            break;
                        }
                    }
                }
                case 5 -> run = false;
            }
        }
        System.out.println();
        System.out.println("이용해 주셔서 감사합니다.");
    }
}
