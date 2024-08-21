package ch04.lecture.p05break;

public class C02Continue {
    public static void main(String[] args) {
//continue; 코드 블럭 내의 나머지 코드를 실행하
        boolean a = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("위 명령문");
            if (a) {
                continue;
            }

            System.out.println("아래 명령문");
        }
    }
}
