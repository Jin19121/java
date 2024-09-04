package ch09.lecture.p02nested;

public class C04Lambda {
    public static void main(String[] args) {
        //lambda: 익명 클래스 정의 + 객체 생성을 한번에
        MyInterface4 o = () -> System.out.println("C04Lambda.main");
        o.some();

        //lambda 풀어쓰면
        class Nested4 implements MyInterface4 {
            @Override
            public void some() {
                System.out.println("Nested4.some");
            }
        }
        Nested4 a = new Nested4();
        a.some();
    }
}

@FunctionalInterface
interface MyInterface4 {
    void some();
}