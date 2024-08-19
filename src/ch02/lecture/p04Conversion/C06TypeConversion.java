package ch02.lecture.p04Conversion;

public class C06TypeConversion {
    public static void main(String[] args) {
//byte, short, int 끼리의 연산 결과는 int
        byte a = 3;
        byte b = 5;
        int c = a + b;

        //정수 끼리의 연산 결과는 정수
        int d = 5;
        int e = 3;
        int f = d / e; // 1.666.. 이 아닌 1 출력
        System.out.println("f = " + f);

    }
}
