package ch06.lecture.p05static;

import ch06.lecture.p01class.MyClass02;

public class C02Field {
    public static void main(String[] args) {
        MyClass002.age = 60;
        MyClass002.name = "DK";
        System.out.println("MyClass02.age = " + MyClass002.age);
        System.out.println("MyClass02.name = " + MyClass002.name);
    }
}

class MyClass002 {
    static int age;
    static String name;
}