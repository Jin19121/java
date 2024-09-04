package ch09.lecture.p02nested;

public class C03LocalClass {

}

class MyClass3 {
    //instance nested class
    //static nested class

    void someMethod() {
        //local class: 메소드 안에서만 쓸 수 있다.
        class Nested1 {
            //field, instructor, method
        }

        Nested1 o = new Nested1();
    }
}

//404-406