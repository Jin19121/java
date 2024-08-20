package ch03.lecture.p01arithmetic;

public class C02Arithmetic {
    public static void main(String[] args) {
        // 연산 결과의 타입은 피연산자 중 큰 타입으로 결정 p.84
        int a = 3;
        long b = 5L;

//        int c = a + b 불가
        long d = a + b;

        long e = 7L;
        double f = 3.14;
        double g = e + f;

        // 나누기(/) : 정수 끼리의 연산 결과는 정수
        System.out.println(10 / 3);

        //실수 끼리의 연산 결과는 실수
        System.out.println(10.0 / 3.0);
        //정수와 실수끼리 연산 결과는 실수
        System.out.println(10 / 3.0);
    }
}
