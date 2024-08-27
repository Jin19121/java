package ch06.lecture.p03method;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C10Return {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    //return type: void, 또는 데이터타입
    public void method1() { //void: return이 불필요

    }

    public int method2() { //void 외 데이터타입: return 필요
        //return:
        //1. method 종료
        //2. 오른쪽 값을 호출한 곳으로 반환(return)
        return 218;// 오른쪽 값이 메소드의 리턴 타입과 타입이 일치해야함
    }

    public String method3() {
        return "DK";

    }

    public int[] method4() {
        return new int[]{1, 4};
    }

    public PrintStream method5() throws FileNotFoundException {
        return new PrintStream("");
    }
}
