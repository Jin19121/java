package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run(); //재정의된 roll 실행

        myCar.tire = new KumhoTire();
        myCar.run();

    }
}
