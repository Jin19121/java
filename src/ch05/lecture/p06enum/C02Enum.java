package ch05.lecture.p06enum;

public class C02Enum {
    public static void main(String[] args) {
        Enum2 season = Enum2.FALL;
        if (season.equals(Enum2.FALL)) {
            System.out.println("가을과 관련된 코드>>>");
        }

        //간결해짐
        switch (season) {
            case SPRING -> {
            }
            case SUMMER -> {
            }
            case FALL -> {
            }
            case WINTER -> {
            }
        }
    }
}

enum Enum2 {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
//197 199