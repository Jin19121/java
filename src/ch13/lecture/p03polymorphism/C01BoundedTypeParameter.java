package ch13.lecture.p03polymorphism;

import java.util.Scanner;

public class C01BoundedTypeParameter {
    public static void main(String[] args) {
        var o1 = new MyClass1<String>();
        var o2 = new MyClass1<Integer>();
        var o3 = new MyClass1<Scanner>();
        o1.method("java");
        o2.method(636);
        o3.method(new Scanner(""));
    }
}

class MyClass1<T> {
    void method(T param) {
        System.out.println(param instanceof Object); //true. Object에는 모두 포함됨
        System.out.println("toString = " + param.toString());
        System.out.println("equals = " + param.equals(null));
        System.out.println("hashCode = " + param.hashCode());

        if (param instanceof String s) { //이게 마음에 안 들면 대입 자료형 제한
            int length = s.length();
            System.out.println("length = " + length);

        }

    }
}