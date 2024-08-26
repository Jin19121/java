package ch06.sec08;

public class Calculator {
    //p 233
    void powerOn() {
        System.out.println("Hello JARVIS");
    }

    void powerOff() {
        System.out.println("JARVIS mute");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
