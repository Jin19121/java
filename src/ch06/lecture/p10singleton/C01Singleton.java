package ch06.lecture.p10singleton;

public class C01Singleton {
    public static void main(String[] args) {
        //설계도를 통해 여러 객체 만들 수 있음 -> 하나만 쓸 때 singleton
//        Country c = new Country();
//        Country d = new Country();
        Country c = Country.getInstance();
        Country d = Country.getInstance();

        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(c));
    }
}

class Country {
    private static Country s;

    private Country() {
    }

    public static Country getInstance() {
        if (s == null) {
            s = new Country();
        }
        return s;
    }
}//276
