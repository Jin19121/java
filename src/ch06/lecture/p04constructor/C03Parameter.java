package ch06.lecture.p04constructor;

public class C03Parameter {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03(1, "guest");
        System.out.println(o1.age);
        System.out.println(o1.name);

        MyClass03 o2 = new MyClass03(10, "DK");
        System.out.println(o2.age);
        System.out.println(o2.name);
    }
}

class MyClass03 {
    int age; //바로 생성자로 연결하는 것이 가능하나 거의 하지 않는다.
    String name;

    MyClass03(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
}