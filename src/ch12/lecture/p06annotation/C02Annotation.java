package ch12.lecture.p06annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class C02Annotation {
    public static void main(String[] args) {

    }
}

//annotation 여기저기 붙여 쓸 수 있지요
@MyAnnotation2
class MyClass2 {
    @MyAnnotation2
    private String name;

    @MyAnnotation2
    public MyClass2(@MyAnnotation2 String name) {
        this.name = name;
    }

    @MyAnnotation2
    public void method1(@MyAnnotation2 int a) {
        @MyAnnotation2
        int b;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {

}