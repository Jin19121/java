package ch06.lecture.p03method;

import java.util.Arrays;

public class C06Parameter {
    public static void main(String[] args) {
        MyClass06 o1 = new MyClass06();
        int v = 10;
        o1.method1(v);//실행 invoke, 호출 call
        System.out.println("v = " + v);

        int[] a = {9, 3, 1};
        o1.method2(a); //참조값이 넘어감
        System.out.println("a[0] = " + a[0]);

        int[] b = {8, 9};
        o1.method2(b);
        System.out.println("Arrays.toSring(b) = " + Arrays.toString(b));
        //파라미터에 변수의 값이 전달됨 (참조 타입만)

        int z = 8;
        o1.method1(z);
        System.out.println("z = " + z);
    }
}

class MyClass06 {
    public void method1(int a) { //method 정의 define
        System.out.println(a);
        a = 88;
    }

    public void method2(int[] a) {
        System.out.println(Arrays.toString(a));
        a[0] = 99;
    }
}
