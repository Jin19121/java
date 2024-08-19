package ch02.lecture.p04Conversion;

public class C05TypeConversion {
    public static void main(String[] args) {
        //연산식 큰 타입으로 자동변환

        int a = 3;
        int b = 5;
        int c = a + b;

        int d = 3;
        long e = 5;
        long f = d + e; //결과가 long이기 때문에 int에 담을 없다

        int g = 3;
        long h = 4000000000L;
        long i = g + h;
        System.out.println("i = " + i);

        int j = 9;
        double k = 3.14;
        double l = j + k;
        System.out.println("l = " + l);
    }
}
