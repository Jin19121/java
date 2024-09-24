package ch12.lecture.p06annotation;

public class C05Element {
    @MyAnnotation5(name = "hello", age = 30)
    String name;

    @MyAnnotation5(age = 44, name = "world")//순서 상관x
    public void method() {
    }
}

@interface MyAnnotation5 {
    //부가정도 정의하기
    //element(attribute)
    String name();

    int age();
}
