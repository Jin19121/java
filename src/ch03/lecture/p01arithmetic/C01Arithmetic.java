package ch03.lecture.p01arithmetic;

public class C01Arithmetic {
    public static void main(String[] args) {
        //산술연산자 + - * / %
        System.out.println(3 + 5);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(8 / 2);
        System.out.println(7 / 2); //두 integer의 연산 결과는 integer => 3.5(x) 3(o)

        // % 나머지 연산 remainder, modulo
        System.out.println(7 % 2);
        System.out.println(8 % 3);

        int a = 10;
        int b = 3;
        System.out.println("result = " + a % b);

        int c = a * b;
        System.out.println("c = " + c);
    }
}
