package ch05.lecture.p06enum;

//enum이 없었다면
public class C01Enum {
    public static void main(String[] args) {
        int season = NoEnum1.FALL;

        if (season == NoEnum1.FALL) {
            System.out.println("가을과 관련된 코드들>>>");
        }

        switch (season) {
            case NoEnum1.SPRING -> {
            }
            case NoEnum1.SUMMER -> {
            }
            case NoEnum1.FALL -> {
            }
            case NoEnum1.WINTER -> {
            }
        }
    }
}

class NoEnum1 {
    public static final int SPRING = 1;
    public static final int SUMMER = 2;
    public static final int FALL = 3;
    public static final int WINTER = 4;
    //값이 나열된 클래스만 있으면 되는데 코드가 너무 많다~
}