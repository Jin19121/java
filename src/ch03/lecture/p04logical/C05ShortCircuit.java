package ch03.lecture.p04logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        //or || 연산의 short circuiting. 왼쪽 피연산자가 true일 시 오른쪽은 연산하지 않음
        int a = 5;
        int b = 5;
        System.out.println((a++) > 0 || (b++) > 0);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 5;
        int d = 5;
        System.out.println((c++) > 0 | (d++) > 0);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
