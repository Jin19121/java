package ch07.lecture.p03polymorphism;

public class C09Polymorphism {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        o1.setNumber(new Integer(333));
        o1.printDoubleNumber();

        MyClass09 o2 = new MyClass09();
        o2.setNumber(new Double(3.14));
        o2.printDoubleNumber();

    }
}

class MyClass09 {
    Number number;

    public void setNumber(Number number) {
        this.number = number;
    }

    public void printDoubleNumber() {
        double v = number.doubleValue();

        System.out.println("v = " + v);
    }
}
//317 318