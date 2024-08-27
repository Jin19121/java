package ch06.sec08;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas 소진");
            return false;
        }
        System.out.println("gas 존재");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println(STR."run (gas 잔량:\{gas})");
                gas -= 1;
            } else {
                System.out.println(STR."stop (gas 잔량:\{gas})");
                return;
            }
        }
    }

}
