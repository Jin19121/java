package ch11.lecture.p01exception;

import java.util.Arrays;

public class C01NullPointerException {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.length()); //ok

        String t = null;
        System.out.println(t.length()); //x
        //가리키는 것이 없는데 액션을 명령할

        //---실행종료---
        System.out.println("다음 코드");
    }
}
