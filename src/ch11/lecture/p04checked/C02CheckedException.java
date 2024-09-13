package ch11.lecture.p04checked;

import static java.lang.Class.forName;

public class C02CheckedException {
    public static void main(String[] args) {
        //checked exception (일반 예외)
        // : RuntimeException을 상속받지 않은 클래스들의 객체
        //   컴파일러가 예외 처리 코드를 작성했는지 체크암
        try {
            forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
