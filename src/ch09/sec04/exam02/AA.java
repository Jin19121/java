package ch09.sec04.exam02;

public class AA {
    class B {
        int field = 1;
        static int field2 = 2;

        B() {
            System.out.println("B.B 생성자 실행");
        }

        void method1() {
            System.out.println("B.method1 실행");
        }

        static void method2() {
            System.out.println("B.method2 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
