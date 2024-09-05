package ch13.lecture.p01generic;

public class C04Generic {
    public static void main(String[] args) {
        MyClass4<String> o1 = new MyClass4<String>();
        MyClass4<Integer> o2 = new MyClass4<Integer>();


        //var: 오른쪽항을 통해 왼쪽항 유추 가능하면 var 타입으로 해두어도 된다.
        int i = 3;
        var j = 5;

        var o3 = new MyClass4<String>();
        var o4 = new MyClass4<Integer>();

    }
}

class MyClass4<T> {

}