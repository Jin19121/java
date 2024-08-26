package ch06.lecture.p03method;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.name = "Tom";

        MyClass03 b = new MyClass03();
        b.name = "Holland";

        a.printName();
        b.printName();
    }
}

class MyClass03 {
    //field
    String name;

    //method
    public void printName() {
        System.out.println(name + "입니다.");
    }
}
