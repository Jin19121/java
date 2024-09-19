package ch14.lecture.p1thread;

import java.awt.*;

public class C03Runnable {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //run method 재정의
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    toolkit.beep();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("띠링");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}//599 3-2에 재정의 확인
