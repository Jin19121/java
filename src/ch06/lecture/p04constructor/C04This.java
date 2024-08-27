package ch06.lecture.p04constructor;

import ch05.sec07.MultidimensionalArrayByNew;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(33, "lee");
        System.out.println(o.age);
        System.out.println(o.name);

        MyClass04 p = new MyClass04(55, "DK");
        System.out.println(p.age);
        System.out.println(p.name);
    }
}

class MyClass04 {
    int age;
    String name;

    //this : 이 클래스로 만들어진 객체의 참조값
    MyClass04(int age, String name) {
        //age = age; 필드명에 대입이 아닌 string 내 parameter에 스스로 대입하고 있다.
        this.age = age;
        this.name = name;
    }
}