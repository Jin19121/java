package ch07.exercise.q09cast;

public class Q09 {
    public static void main(String[] args) {
//        B b = new B();
        B b = (B) new A(); // 컴파일 상 오류는 없지만 실행하면 에러가 난다.
    }

    static void method(B b) {
        method((B) new A()); //마찬가지로 컴파일 오류는 아니지만 실행이 안됨.
    }
}

class A {

}

class B extends A {
}

class D extends B {
}

class C extends A {
}
