package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "Android");

        String strObj = myPhone.toString();
        System.out.println(strObj); //String type

        System.out.println(myPhone); //SmartPhone type -> Object type (valueOf)
    }
}
