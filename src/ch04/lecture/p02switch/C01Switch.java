package ch04.lecture.p02switch;

public class C01Switch {
    public static void main(String[] args) {
        //switch(조건문, 분기문)

        //1,2,3
        int n = (int) (Math.random() * 3) + 1;
        // switch에 들어갈 수 있는 값: 정수, String, enum 등등
        switch (n) {
            case 1 -> {
                System.out.println("첫번째 수 출력");
            }
            case 2 -> {
                System.out.println("두번째 수 출력");
            }
            case 3 -> {
                System.out.println("세번째 수 출력");
            }

        }
    }
}
