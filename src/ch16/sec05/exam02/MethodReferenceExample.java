package ch16.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
//        person.ordering((String a, String b)-> a.compareToIgnoreCase(b));
        person.ordering(String::compareToIgnoreCase);
    }
}
