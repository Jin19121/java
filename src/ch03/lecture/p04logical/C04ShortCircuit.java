package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
// short-circuiting  논리연산 (&&. ||) 시, 왼쪽 피연산자에 의해 결과가 예측될 경우 오른 피연산자를 연산하지 않음
        boolean a = false && false; //전자만 false여도 a는 false

        int b = 5;
        int c = 5;
        boolean d = ((b++) < 0) && ((c++) < 0);

        System.out.println("b = " + b);
        System.out.println("c = " + c); //b까지만 연산하고 c는 연산하지 않음.

        int e = 5;
        int f = 5;
        boolean g = ((e++) < 0) & ((f++) < 0); //& 한번만 사용할 시 오른쪽 피연산자까지 연산

        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
