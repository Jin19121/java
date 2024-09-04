package ch09.lecture.p02nested;

public class C02StaticNestedClass {
    public static void main(String[] args) {
        MyClass2 a = new MyClass2();
        MyClass2.Nested1 b = a.new Nested1();

        MyClass2.Nested2 o = new MyClass2.Nested2();
    }
}

class MyClass2 {
    //@formatter:off
    // instance nested class
    class Nested1 {}

    //static nested class
    static class Nested2{}

     void someMethod(){
        Nested1 a = new Nested1();
        Nested2 b = new Nested2();
    }
}