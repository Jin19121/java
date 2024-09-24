package ch12.lecture.p06annotation;

public class C07Element {
    //기본값 사용 name = "son", age = 1
    @MyAnnotation7
    int a;

    @MyAnnotation7(name = "son", age = 1)//int a와 같다
    int b;

    @MyAnnotation7(name = "kim") //기본값에 의해 age=1
    int c;
}

@interface MyAnnotation7 {
    //element 기본값
    String name() default "son";

    int age() default 1;
}
