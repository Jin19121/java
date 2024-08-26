package ch06.sec06;

public class Car01Example {
    public static void main(String[] args) {
        Car01 myCar = new Car01();

        //초기값 확인
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동 여부: " + myCar.start);
        System.out.println("현재 속도: " + myCar.speed);
    }
}
