package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super();//안 써도 자동으로 추가됨
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}

