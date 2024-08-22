package ch04.sec03;

public class SwitchNoBreakCase {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("현재 시간 : " + time + "시");

        switch (time) {
            case 8:
                System.out.println("출근 시간");
            case 9:
                System.out.println("회의 시간");
            case 10:
                System.out.println("업무 시간");
            case 11:
                System.out.println("외근");
        }
    }
}
