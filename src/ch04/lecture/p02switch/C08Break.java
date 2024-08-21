package ch04.lecture.p02switch;

public class C08Break {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 3) + 1;
        System.out.println("n> " + n);

        switch (n) {
            case 1:
                System.out.println("no. 1");
                break;//break를 잊을 시 그 case부터 이하 case 전부 실행
            case 2:
                System.out.println("no. 2");
                break;
            case 3:
                System.out.println("no. 3");
                break;
        }
    }
}
