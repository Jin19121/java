package ch02.lecture.p03string;

public class C01String {
    public static void main(String[] args) {
        char a = '가';
        System.out.println("a= " + a);
//        char b = '가나' 와 같은 건 불가. String이 문자열 저장 타입
        String c = "가나"; //큰 따옴표 사용
        System.out.println("c= " + c);

        String d = "It's good";
        System.out.println("d= " + d);

        //String 내에서 큰 따옴표는 역슬래시와 함께
        String e = "it is \"good\"";
        System.out.println("e= " + e);

        //역슬래시는 역슬래시와 함께
        String f = "\\는 특수기호 사용 시";
        System.out.println("f= " + f);

        //역슬래시 사용 예시 52p
        String g = "\'생각생각생각생각\'";
        System.out.println("g= " + g);

        String h = "다음줄 \n 표현";
        System.out.println("h= " + h);

        String i = "탭 \t표현";
        System.out.println("i= " + i);

    }
}
