package ch04.lecture.p03while;

public class C01While {//p. 131

    public static void main(String[] args) {
        System.out.println(1);

        boolean a = true;
        while (a) {
            System.out.println(2);
            System.out.println(3);//영원히 반복
            a = false; //반복 끝
        }
        System.out.println("-----");
        int i = 0;
        while (i < 3) {
            System.out.println(22);
            System.out.println(33);
            i++;
        }
        System.out.println(4);
        System.out.println(5);
    }
}
