package ch14.lecture.p1thread;

import java.awt.*;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);//소리 1000ms(1초) 멈춤
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        //두번째 스레드
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("띠링");
                    try {
                        Thread.sleep(1000); //텍스트 1초 멈춤
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}//601

// 한번 쓰고 버리는 클래스가 많을 땐 익명 클래스를 주로 사용
//class MyThread1 extends  Thread{
//    @Override
//    public void run() {
//        System.out.println("어떤 일...");
//    }
//}