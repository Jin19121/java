package ch06.lecture.p03method;

//파라미터
public class C07Overloading {
    public static void main(String[] args) {

        MyClass07 o1 = new MyClass07();
        o1.method1();
        o1.method1(7);
    }
}

class MyClass07 {
    //method overloading: 파라미터 목록이 다른, 같은 이름의 메소드를 작성할 수 있다.
    //파라미터 목록
    public void method1() {
        System.out.println("activate");
    }

    public void method1(int a) {
        System.out.println("activate 2...");
    }

    public void method1(String a) {

    }

    public void method1(int a, int b) {

    }

    public void method1(int a, String b) {

    }

    public void method1(String a, int b) {

    }
}
