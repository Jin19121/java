package ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        //static method
//        person.action((a, b)-> Computer.staticMethod(a, b));
        person.action(Computer::staticMethod);

        //instance method
        Computer com = new Computer();
//        person.action((x, y)-> com.instanceMethod(x, y));
        person.action(com::instanceMethod);
    }
}
