package ch06.Exercise.q20;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Account20[] account = new Account20[100];
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("""
                    -----------------------------------------------------
                     1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
                    -----------------------------------------------------
                    """);
            System.out.print("선택> ");
            int select = scanner.nextInt();


            switch (select) {
                case 1 -> {
                    System.out.println("""
                            ---------- 
                             계좌 생성
                            ----------""");
                    System.out.print("계좌번호: ");
                    int no = scanner.nextInt();
                    System.out.print("계좌주: ");
                    String name = scanner.next();
                    System.out.print("초기 입금액: ");
                    int balance = scanner.nextInt();

                    Account20 newAccount = new Account20(no, name, balance);
                    for (int i = 0; i < account.length; i++) {
                        if (account[i] == null) {
                            account[i] = newAccount;
                            System.out.println("결과: 계좌가 생성되었습니다.");
                            System.out.println();
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("""
                            ---------- 
                             계좌 목록
                            ----------""");
                    for (int i = 0; i < account.length; i++) {
                        Account20 list = account[i];
                        if (list != null) {
                            System.out.print(STR."""
                                    \{list.getNo()}     \{list.getName()}      \{list.getBalance()}
                                    """);
                        }
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("""
                            ---------- 
                             예금
                            ----------""");
                    System.out.print("계좌번호: ");
                    int no = scanner.nextInt();
                    System.out.print("입금액: ");
                    int Input = scanner.nextInt();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("""
                            ---------- 
                             출금
                            ----------""");
                    System.out.print("계좌번호: ");
                    int no = scanner.nextInt();
                    System.out.print("출금액: ");
                    int Output = scanner.nextInt();
                    System.out.println("결과: 출금이 성공되었습니다.");
                    System.out.println();
                }
                case 5 -> run = false;
            }
        }
        System.out.println();
        System.out.println("프로그램 종료");

    }
}
