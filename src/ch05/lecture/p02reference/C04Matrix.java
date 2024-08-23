package ch05.lecture.p02reference;

import java.util.Arrays;

public class C04Matrix {
    public static void main(String[] args) {
        //행의 수만 결정
        int[][] m = new int[3][];
        System.out.println("m.length = " + m.length);
        System.out.println("m[0] = " + m[0]);
        System.out.println("m[1] = " + m[1]);
        System.out.println("m[2] = " + m[2]);
        System.out.println(Arrays.toString(m));

        System.out.println("-----");
        m[0] = new int[3];
        m[1] = new int[]{22, 33, 44};
        m[2] = new int[]{99, 88};//열이 같을 필요 없음
        System.out.println("m.length = " + m.length);
        System.out.println("m[0] = " + m[0]);
        System.out.println("m[1] = " + m[1]);
        System.out.println("m[2] = " + m[2]);
        System.out.println(Arrays.toString(m));
        System.out.println("m[0] = " + Arrays.toString(m[0]));
//
        System.out.println("----");
        System.out.println(m[1][0]);
        System.out.println(m[1][2]);
        System.out.println(m[2][1]);
    }
}
