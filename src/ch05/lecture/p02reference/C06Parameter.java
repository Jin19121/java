package ch05.lecture.p02reference;

public class C06Parameter {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 7};
        method1(arr);
        System.out.println("3. " + arr[0]);
    }

    public static void method1(int[] a) {
        System.out.println("1. " + a[0]);
        a[0] = 44;
        System.out.println("2. " + a[0]);
    }
}
