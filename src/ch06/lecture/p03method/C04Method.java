package ch06.lecture.p03method;

import java.sql.SQLOutput;

public class C04Method {
    public static void main(String[] args) {
        MyClass04 o1 = new MyClass04();
        o1.method1();
        o1.method2();
    }
}

class MyClass04 {
    public void method1() {
        System.out.println("let's go!");
    }

    public void method2() {
        System.out.println("go, go!");
    }
}
