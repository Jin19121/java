package ch11.sec05;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception {
        findClass();
    }

    public static void findClass() throws ClassNotFoundException { //try Catch or method에 명시: 명시
        Class.forName("java.lang.String2");
    }
}
