package ch14.lecture.p2status;

public class C01Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> { //스레드 객체 생성 NEW
            for (int i = 0; i < 10; i++) {
                System.out.println("스레드1@@@@@@@@");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("스레드2########");
                try {
                    Thread.sleep(500); //실행 잠깐 멈춤 -> 다른 스레드 실행
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start(); //실행대기 -> CPU에서 실행
        t2.start(); //순서가 섞일 수 있음
    }
}
