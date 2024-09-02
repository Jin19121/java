package ch08.lecture.p02etc;

public class C05Extends {
    public static void main(String[] args) {
        MyClass5 o = new MyClass5();
        MyInterface5 a = o;
        SubInterface5 b = o;

        a.method1(); //method2는 사용 못함

        b.method1();
        b.method2();
    }
}

interface MyInterface5 {
    void method1();
}

interface SubInterface5 extends MyInterface5 {
    void method2();
}

class MyClass5 implements SubInterface5 {
    @Override
    public void method1() {
        System.out.println("MyClass5.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass5.method2");
    }
}
//367~369