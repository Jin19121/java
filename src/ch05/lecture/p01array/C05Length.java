package ch05.lecture.p01array;

public class C05Length {
    public static void main(String[] args) { //p. 177
        int i = 5;

        int[] arr = new int[10];
        int l = arr.length;
        System.out.println("l=" + l); //배열 arr의 길이 저장

        int[] brr = new int[5];
        System.out.println("b = " + brr.length);

        int[] crr = new int[10];
        System.out.println("c = " + crr.length);

        int[] drr = new int[5];
        drr[0] = 5;
        drr[1] = 7;
        drr[2] = 9;

        for (int j = 0; j < drr.length; j++) {
            System.out.println("d = " + drr[j]);
        }
    }
}
