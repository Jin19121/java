package ch08.lecture.p02etc;

public class C02DefaultMethod {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        o.method1();
        o.method2();

        MyInterface2 p = new MyClass22();
        p.method1();
        p.method2();
    }
}

interface MyInterface2 {
    void method1();

    //코드 블럭(메소드 몸통, body)이 있는 인터페이스 메소드
    //public 생략
    default void method2() {
        System.out.println("MyInterface2.method2");
    }
}

class MyClass21 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass21.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass21.method2");
    }
}

class MyClass22 implements MyInterface2 {
    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }
}