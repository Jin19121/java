package ch16.lecture.p01lambda;

public class C07Parameter {
    public static void main(String[] args) {
        MyInterface7 o = () -> System.out.println("코드");
        o.some();
    }
}

//파라미터 1개
@FunctionalInterface
interface MyInterface7 {
    void some();
}