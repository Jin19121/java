package ch06.lecture.p03method;

public class C11Return {

}

class MyClass11 {
    public void method1() {

    }

    //메소드의 return type이 있는 경우 꼭 코드 실행 중 return문이 실행되도록 해야함
    public int method2() {
        System.out.println("어떤 명령문이든");
        boolean a = true;
        if (a) {
            return 3; //int return이 안 되는 경우가 있어선 안됨
        } else {
            return 5; //반드시 int를 만나야
        }
    }
}
