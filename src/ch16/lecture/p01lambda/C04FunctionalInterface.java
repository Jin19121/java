package ch16.lecture.p01lambda;

public class C04FunctionalInterface {
    public static void main(String[] args) {

    }
}

//Functional Interface
@FunctionalInterface //추상메소드 하나인지 검사
interface MyInterface4 {
    void method();
}

//@FunctionalInterface x
interface MyInterface42 {

}

//@FunctionalInterface x
interface MyInterface43 {
    void method1();

    void method2();
}

//다른 메소드 상관 없이 추상메소드가 하나 있으면 된다.
@FunctionalInterface
interface MyInterface44 {
    int MAX_VALUE = 100;

    void method1();

    default void method2() {
    }

    private void method3() {
    }

    static void method4() {
    }

    private static void method5() {
    }
}