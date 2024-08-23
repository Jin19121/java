package ch05.lecture.p02reference;

import java.util.Arrays;

public class C12MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = {{98, 76, 65}, {54, 21, 10}};
        //m2에 m1을 복사하는 코드

        int[][] m2 = new int[m1.length][];

        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];
        }
        System.out.println(Arrays.toString(m2[0]));
        m2[0][0] = 1010;
        System.out.println(m1[0][0]);//깊은 복사
//? 확인 요망
    }
}
