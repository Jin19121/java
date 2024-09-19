package ch14.lecture.p2status;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {//main thread
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("쓰레드1######");
            }
        });
        t1.start();

        t1.join();//t1 스레드가 끝나기를 기다림
        for (int i = 0; i < 1000; i++) {
            System.out.println("메인쓰레드@@@@@");
        }
    }
}
