package ch06.sec08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(10);

        if (myCar.isLeftGas()) {
            System.out.println("go");
            myCar.run();
        }
        System.out.println("need gas");
    }
}
