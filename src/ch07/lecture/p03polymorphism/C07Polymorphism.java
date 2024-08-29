package ch07.lecture.p03polymorphism;

import java.util.Scanner;

public class C07Polymorphism {
    public static void main(String[] args) {
        String a = "Java";
        Scanner scanner = new Scanner(System.in);
        Object b = a;
        print(a);
        print(scanner);
    }

    public static void print(Object o) {//a가 들어갈 수 있다
        String s = o.toString();
        int i = o.hashCode();

        System.out.println("s = " + s);
        System.out.println("i = " + i);
    }
}
