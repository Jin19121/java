package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;

        //stop은 오버라이딩 불가
    }
}
