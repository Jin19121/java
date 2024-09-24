package ch05.lecture.p06enum;

public class C03Enum {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        System.out.println(s.name());
        System.out.println(s.ordinal()); //순서
        System.out.println(s.toString());
        System.out.println();

        s.method();
        System.out.println();
        
        Season s2 = Season.valueOf("FALL");
        System.out.println(s2.name());
        System.out.println(s2.ordinal());
        System.out.println(s2);
    }
}

enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    public void method() {
        System.out.println("Season.method");
    }
}
//enum도 특별하더라도 class인 만큼 일반적인 class처럼 method를 쓸 수 있다.