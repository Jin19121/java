package ch09.sec04.exam01;

public class A {
    //생성자 instructor
    A() {
        //로컬 클래스 선언
        class B {
        }
        B b = new B();
    }

    //메소드
    void method() {
        //로컬 클래스 선언
        class B {
        }
        B b = new B();
    }
}
