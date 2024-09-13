package ch11.lecture.p05throw;

import java.io.IOException;

public class C04Throw {
    public static void action1() throws IOException {
        throw new IOException();
    }

    public static void action2() throws IOException {
        action1();
    }

    public static void action3() throws IOException {
        action2(); //시그니처 붙이던가, tru catch로 싸던가
    }


    public static void action4() {
        try {
            action3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        action3();
        //main에도 throw: 프로그램 종료
    }
}
