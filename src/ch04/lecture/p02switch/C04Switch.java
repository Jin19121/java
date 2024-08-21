package ch04.lecture.p02switch;

public class C04Switch {
    public static void main(String[] args) {
        //p03과 동일한 내용을 고전적으로
        int n = (int) (Math.random() * 6) + 1;

        System.out.println("n = " + n);
        switch (n) {
            case 1:
            case 3:
            case 5:
                System.out.println("홀");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("짝");
                break;
        }
    }
}
