package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        //158p
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("참조값 동일");
        } else {
            System.out.println("참조값 같지 않음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("참조값 동일");
        } else {
            System.out.println("참조값 같지 않음");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("S1과 S2 동일");
        }
        if (strVar2.equals(strVar4)) {
            System.out.println("");
        }
    }
}
