package ch12.lecture.p06annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class C04Annotation {
    public static void main(String[] args) {
        Class<MyClass4> c = MyClass4.class;
        Annotation[] annotations = c.getDeclaredAnnotations();
        //annotation의 유지 시간을 알아볼 수 있음
        System.out.println(annotations.length);
    }
}

@MyAnnotation4
class MyClass4 {

}

//@Retention(RetentionPolicy.RUNTIME) //실행시간동안 내내 유지
//@Retention(RetentionPolicy.CLASS) // 컴파일까지 (기본값)
//@Retention(RetentionPolicy.SOURCE) // 컴파일 전까지
@interface MyAnnotation4 {
}
