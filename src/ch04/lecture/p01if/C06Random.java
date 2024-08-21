package ch04.lecture.p01if;

public class C06Random {
    public static void main(String[] args) {
        //임의의 수 리턴
        //0과 1 사이의 실수(double) 0<= n <1
        double n = Math.random();
        System.out.println("n = " + n);

        //목표 1,2,3
        //0<= n <1  ->   0<= 3*n <3  -> 정수화
        System.out.println((int) ((n * 3) + 1));
    }
}
