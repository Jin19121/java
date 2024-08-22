package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        switch (num) {
            case 1 -> System.out.println("1보 전진");
            case 2 -> System.out.println("2보 전진");
            case 3 -> System.out.println("3보 전진");
            case 4 -> System.out.println("4보 전진");
            case 5 -> System.out.println("5보 전진");
            case 6 -> System.out.println("6보 전진");
        }
    }
}
