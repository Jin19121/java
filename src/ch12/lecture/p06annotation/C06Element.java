package ch12.lecture.p06annotation;

public class C06Element {
    @MyCnnotation6(name = "hello", age = 30)
    int a;

    @MyCnnotation6(name = {"world", "java", "css"}, age = 40)
    int b;

    //값이 한 개면 배열에서 {} 생략 가능
    @MyCnnotation6(name = {"spring"}, age = 50)
    int c;
}


@interface MyCnnotation6 {
    //element
    String[] name();//같은 이름으로 여러 element 들어가면 배열로

    int age();
}