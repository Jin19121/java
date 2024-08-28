package ch06.lecture.p06final;

public class C04InstanceField {
    public static void main(String[] args) {

    }
}

class MyClass04 {
    int a; // 초기값 0
    final int b = 3; //final로 지정했으면 반드시 할당해야 한다.
    final int c; //혹은 생성자에서 할당 가능

    MyClass04() {
        c = 9;
    }

    MyClass04(String a) {
        //한 생성자만 불러와서 아용하기 때문에 다른 생성자에서 다르게 할당해도 충돌하지 않는다.
        c = 99;
    }
}
