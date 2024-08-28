package ch06.lecture.p05static;

public class C06Member {
    public static void main(String[] args) {

    }
}

//member: field, method(, constructor)
//static member에서 instance member에 접근 불가능
//instance member에서 static member 접근 가능

class MyClass06 {
    static int number;
    int age;

    static void method() {
        System.out.println(number);
//        System.out.println(age); -> 불가
    }

    void method2() {
        System.out.println(number);
        System.out.println(age);
    }
}