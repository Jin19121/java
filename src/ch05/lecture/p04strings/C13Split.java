package ch05.lecture.p04strings;

public class C13Split {
    public static void main(String[] args) {
        //split: 문자열을 나누는 메소드
        String s = "java,css,spring,react";
        String[] t = s.split(",");
        System.out.println(t[0]);
        System.out.println(t[1]);
        System.out.println(t[2]);
        System.out.println(t[3]);

        String u = "java css html";
        String[] v = u.split(" ");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);

        String w = "java css";
        String[] x = w.split("");
        System.out.println(x[0]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        System.out.println(x[7]);

        String y = "java  css";
        String[] z = y.split(" ");
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);

        String[] a = y.split(" +");
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
