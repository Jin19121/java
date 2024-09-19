package ch14.lecture.p3synchronized;

public class C02Thread {
    private static int value = 0;

    private static Object o = new Object(); //lock, monitor

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) { //객체 o를 획득하여 (유효 확인) 해당 코드블럭 실행 후 반납
                    //이 쓰레드가 실행되는 동안 다른 쓰레드가 개입하지 않음
                    value++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) { //같은 객체를 대입하여 획득 순서가 섞이지 않도록 함
                    value++;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("value = " + value);
    }
}//613-615
