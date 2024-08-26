package ch05.lecture.p04strings;

import java.util.Arrays;

public class C07ToCharArray {
    public static void main(String[] args) {
        //toCharArray: char 배열을 리턴
        String s = "java language";
        char[] arr = s.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length - 1]);
    }
}
