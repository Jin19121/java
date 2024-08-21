package ch04.lecture.p02switch;

public class C02Switch {
    public static void main(String[] args) {
        //switch 고전적인 방법
        int n = (int) (Math.random() * 3) + 1;

        switch (n) {
            case 1:
                System.out.println("첫번째");
                break;
            case 2:
                System.out.println("두번째");
                break;
            case 3:
                System.out.println("세번째");
                break;
        }
    }
}
