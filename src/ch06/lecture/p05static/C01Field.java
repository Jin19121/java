package ch06.lecture.p05static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 o2 = new MyClass01();
        System.out.println(o1.age);
        System.out.println(MyClass01.number);  //static field는 인스턴스 없이 사용 가능

    }
}

class MyClass01 {
    int age;//instance field

    static int number; //static field or class field
}
