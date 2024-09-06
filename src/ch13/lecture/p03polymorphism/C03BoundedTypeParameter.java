package ch13.lecture.p03polymorphism;

import ch03.sec07.LogicalOperatorExample;

public class C03BoundedTypeParameter {
    public static void main(String[] args) {
        var o1 = new MyClass3<Integer>();
        o1.method(33);
        var o2 = new MyClass3<Double>();
        o2.method(3.14);
        var o3 = new MyClass3<Long>();
        o3.method(333L);
    }
}

//type parameter 의 상한/경계 지정
// Number 는 숫자만
class MyClass3<T extends Number> {
    void method(T param) {
        System.out.println(param.doubleValue());
        System.out.println(param.intValue());
        System.out.println(param.longValue());
    }
}//584