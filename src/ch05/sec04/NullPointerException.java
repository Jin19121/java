package ch05.sec04;

public class NullPointerException {
    public static void main(String[] args) {
        //153p
        int[] intArray = null;
        intArray[0] = 10;

        String str = null;
        System.out.println(str.length());
    }
}
