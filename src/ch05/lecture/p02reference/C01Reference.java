package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int[] arr;//참조변수 arr

        a = 3;
        arr = new int[]{5, 6};//{5, 6}이 객체 (instance) => 편의상  arr 객체라고 함

        System.out.println(a);//3
        System.out.println(arr);//arr의 인스턴스 참조값
        System.out.println(System.identityHashCode(arr)); //저장 참조값을 10진수로 확인

        int b;
        b = a;

        a = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] brr;
        brr = arr; //brr로 arr와 동일한 인스턴지(객체)를 참조

        arr[0] = 50;
        System.out.println("arr[0]: " + arr[0]);
        System.out.println("brr[0]: " + brr[0]);


    }
}
