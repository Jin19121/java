package ch05.lecture.p01array;

public class C07Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 99;
        arr[1] = 88;
        arr[2] = 77;

        //배열의 길이와 초기값을 한 번에 설정
        int[] brr;
        brr = new int[]{55, 44, 33, 22}; //이 순서대로 인덱스값 고정. 길이도 적힌대로 끝

        //old하게
        for (int i = 0; i < brr.length; i++) {
            System.out.println("brr[i] = " + brr[i]);
        }
        System.out.println("------");
        //new하게~
        for (int j : brr) {
            System.out.println("brr[i] = " + j);
        }
    }
}
