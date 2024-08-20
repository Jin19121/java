package ch03.lecture.p04logical;

public class C01Logical {
    public static void main(String[] args) {
        //논리 연산자 and or xor not

        //and && : 두 피연산자가 모두 true일 때만 결과 true
        System.out.println("--|and|--");
        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false
        System.out.println();

        //or || 두 피연산자가 모두 false일 때만 결과 false
        System.out.println("--|or|--");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();

        //xor ^ (caret) 두 피연산자가 다르면 true, 같으면 false
        System.out.println("--|xor|--");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println();

        //not ! 결과는 피연산자의 반대
        System.out.println("--|not|--");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();
    }
}
