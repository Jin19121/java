package ch14.lecture.p3synchronized;

public class C01Thread {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });

        t1.start();
        t2.start();

        System.out.println("value = " + value);//바로 실행되기 때문에 0

        t1.join();
        t2.join();

        System.out.println("value = " + value);
        //20000이 출력되지 않음: 대기 상태가 섞이면서 진행되던 값을 덮어쓰는 경우가 생김
        //여러 쓰레드가 같은 객체의 상태를 바꿀 때 매우 주의해야함
        // -> 하지 마세요
    }
}
