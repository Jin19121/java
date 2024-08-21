package ch04.lecture.p02switch;

public class C07CurlyBracket {
    public static void main(String[] args) {
        //if, else if, else, case의 코드 블럭이 한 줄이면 중괄호 생략 가능
        //중괄 호 생략 시 코드가 읽기 어려우면 생략하지 말 것
        if (true) {
            System.out.println(1);
            System.out.println(2);
        }

        if (false)
            System.out.println(3);
        else if (true)
            System.out.println(4);
        else
            System.out.println(5);


        int n = 3;
        switch (n) {
            case 1 -> {
                System.out.println(10);
                System.out.println(11);
            }
            case 2 -> System.out.println(12);
            case 3 -> System.out.println(13);
        }
    }
}
