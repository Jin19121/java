package ch12.lecture.p03math;

public class C01Math {
    public static void main(String[] args) {
        //random: 0.0 <= 임의의 값 리턴 < 1.0
        double r = Math.random();
        System.out.println("r = " + r);

        //abs: 절대값
        System.out.println("abs");
        double v = Math.abs(-5.123);
        System.out.println("v = " + v);
        double a = Math.abs(7.321);
        System.out.println("a = " + a);

        //round: 반올림
        System.out.println("round");
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.5));

        //floor: 소수점 밑 버림
        System.out.println("floor");
        System.out.println(Math.floor(3.15));
        System.out.println(Math.floor(3.14537));

        //ceil: 올림
        System.out.println("ceil");
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.9));

        //max: 큰 값 리턴
        System.out.println("max");
        System.out.println(Math.max(8, 4));
        System.out.println(Math.max(3.14, 2.1234));

        //min: 작은 값 리턴
        System.out.println("min");
        System.out.println(Math.min(5, 2));
        System.out.println(Math.max(3.1444, 5.6544));
    }
}
