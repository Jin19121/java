package ch03.lecture.p05priority;

public class C01Priority {
    public static void main(String[] args) {
        //연산자 우선순위 107p

        int a = 3 + 5 * 2;
        System.out.println("a = " + a);

        //()로 먼저 연산되는 부분 감싸기
        int b = 3 + (5 * 2);
        System.out.println("b = " + b);

        int c = (3 + 5) * 2;
        System.out.println("c = " + c);

        int x = 10;
        int y = 5;
        System.out.println(x % 3 == 2 || y % 2 != 1); //괄호의 유무가 연산에 영향을 주지 않더라도 사람에게 가독성을 높인다.
        System.out.println((x % 3 == 2) || (y % 2 != 1));

    }
}
