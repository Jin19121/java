package ch12.lecture.p03math;

//static import

import java.util.Arrays;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class C02StaticMember {
    public static void main(String[] args) {
//static => 사용에 용이
        double p = PI; // static field

        int m = max(300, 400); // static method

        int[] a = {5, 9, 1};
        int[] b = copyOf(a, a.length);
    }
}

//531