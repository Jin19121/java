package ch05.lecture.p02reference;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C09ArrayCopy {
    public static void main(String[] args) {
        int[] a = {5, 6, 7};
        int[] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        b[0] = 99;
    }
}
