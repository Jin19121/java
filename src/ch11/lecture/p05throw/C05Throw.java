package ch11.lecture.p05throw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05Throw {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("");
    }

    public static void action() throws ClassNotFoundException, FileNotFoundException {
        //두 예외 throws하던가 공통된 상위 타입 Exception Throwable 등등
        Class.forName("");

        var io = new FileInputStream("");
    }

    public static void action2() throws Exception {
        Class.forName("");
        new FileInputStream("");
    }
}
