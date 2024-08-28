package ch06.lecture.p05static;

public class C05StaticBlock {
    public static void main(String[] args) {
        System.out.println(MyClass05.number);
    }
}

class MyClass05 {
    static int number;
    int age;

    static {
        //static field 초기화
        boolean a = true;
        if (a) {
            number = 10;
        } else {
            number = 100;
        }
    }

    MyClass05() {
        //instance field 초기화
        age = 5;

    }
}