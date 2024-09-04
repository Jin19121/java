package ch12.lecture.p01object;

public class C11ToString {
    public static void main(String[] args) {

    }
}

class MyClass11 {
    private String name;
    private String email;
    private String eddress;

    @Override
    public String toString() {
        return "MyClass11{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", eddress='" + eddress + '\'' +
                '}';
    }
}
