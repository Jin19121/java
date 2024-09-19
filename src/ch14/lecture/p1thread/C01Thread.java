package ch14.lecture.p1thread;

import java.awt.*;

public class C01Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        toolkit.beep(); //띵 소리
        //스레드 만들기
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            Thread.sleep(1000);//소리 1000ms(1초) 멈춤
        }
        //두번째 스레드
        for (int i = 0; i < 5; i++) {
            System.out.println("띠링");
            Thread.sleep(1000); //텍스트 1초 멈춤
        }
    }
}