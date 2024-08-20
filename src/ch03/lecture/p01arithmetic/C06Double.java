package ch03.lecture.p01arithmetic;

public class C06Double {
    public static void main(String[] args) {
        //Infinity : 양의 무한대
        //-Infinity : 음의 무한대

        //정수 연산 시 0으로 나눌 수 없음
//        System.out.println(3 / 0); => 오류

        //실수 연산 시 0으로 나누면 Infinity
        System.out.println(3.0 / 0);
        System.out.println(-3.0 / 0);

        double a = 3.0 / 0; //Infinity
        System.out.println("a : " + a);
        a = a - 100000000000000L;
        System.out.println("a : " + a);

        //Infinity인지 확인
        System.out.println(Double.isInfinite(a));
        System.out.println(Double.isInfinite(3.0));

        System.out.println("-----------");

        //NaN (Not A Number)
        System.out.println(3.0 % 0);

        double b = 3.0 % 0;
        b = b * 1;
        System.out.println("b : " + b);

        //NaN 인지 확인
        System.out.println(Double.isNaN(a));
        System.out.println(Double.isNaN(b));
        System.out.println(Double.isNaN(3.0));

        System.out.println("-----------");

        //Finity인지 확인
        System.out.println(Double.isFinite(a));
        System.out.println(Double.isFinite(b));
        System.out.println(Double.isFinite(3.0));
    }
}
