package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> { //Car로 타입 결정했기 때문에 클래스에 적용할 필요는 없다.
    @Override
    public Car rent() {
        return new Car();
    }
}
