package ch06.lecture.p04constructor;

public class C07Overloading {
    public static void main(String[] args) {
        MyClass07 o = new MyClass07(1, 44, "son", "seoul");
        MyClass07 p = new MyClass07(2, 55);
        MyClass07 q = new MyClass07("DK", "London");

    }
}

class MyClass07 {
    int no;
    int age;
    String name;
    String address;

    MyClass07(int no, int age, String name, String address) {
        this.no = no;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    MyClass07(int no, int age) { //사용하고 싶은 파라미터가 다를때 overload 사용
        this.no = no;
        this.age = age;
    }

    MyClass07(String name, String address) {
        this.name = name;
        this.address = address;
    }
}