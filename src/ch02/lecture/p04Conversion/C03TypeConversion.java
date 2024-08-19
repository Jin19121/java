package ch02.lecture.p04Conversion;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 정수 byte, short, int, long <--> 실수 float, double 형변환
        // 자주 쓰는 : int, long <--> double
        //56, 60
        long a = 50000;
        double b = a;

        double c = 50000;
        long d = (long) c;

        System.out.println("b = " + b);
        System.out.println("d = " + d);
    }
}
