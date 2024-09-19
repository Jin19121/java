package ch14.sec06.exam00;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();

        User1Thread thread1 = new User1Thread();
        thread1.setCalculator(calculator);

        User2Thread thread2 = new User2Thread();
        thread2.setCalculator(calculator);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int memory = calculator.getMemory();
        System.out.println("memory = " + memory);
    }
}
