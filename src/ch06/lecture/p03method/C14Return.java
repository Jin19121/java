package ch06.lecture.p03method;

public class C14Return {

}

//return:
//1. 메소드 종료
//2. 오른쪽 값 반환

class MyClass14 {
    public int method1() {
        boolean a = true;
        if (a) {
            return 3;
        }
        System.out.println("실행문..."); // return 후에 붙으면 실행 안됨. return 에서 종료
        return 5;
    }

    public void method2() {
        // return : 1.메소드 종료 => 해당 목적으로만 사용 가능
        boolean a = true;
        if (a) {
            return;
        }
        System.out.println("certain cases...");
    }
}