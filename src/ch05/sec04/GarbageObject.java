package ch05.sec04;

public class GarbageObject {
    public static void main(String[] args) {
        //155p
        String hobby = "여행";
        hobby = null;

        String kind1 = "차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }
}
