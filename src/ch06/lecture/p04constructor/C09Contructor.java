package ch06.lecture.p04constructor;

public class C09Contructor {
    public static void main(String[] args) {
        MyClass091 o1 = new MyClass091();
        MyClass092 o2 = new MyClass092(); //생성자 없이 기능
    }
}

class MyClass091 {
    //생성자를 작성하지 않으면 파라미터 없는 생성자(no/zero-agrs constructor)가 자동으로 작성됨
    MyClass091() {
    } //<-이게 기본 생성 되는 것과 같다.
}

class MyClass092 {
    // 파라미터가 있는 생성자 작성 시 기본생성자는 자동으로 추가되지 않음.
    MyClass092(int a) {
    }

    //파라미터 없는 생성자 필요 시 명시적으로 작성해야 함
    MyClass092() {
    }
}
