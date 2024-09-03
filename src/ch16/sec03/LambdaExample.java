package ch16.sec03;

public class LambdaExample {

    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을/를 합니다.");
        });
        person.action1((name, job) -> System.out.println(STR."\{name}이 \{job}을/를 하지 않습니다."));

        person.action2(word -> {
            System.out.print(STR."\"\{word}\"");
            System.out.println("(이)라고 말합니다.");
        });
        person.action2(word -> System.out.println(STR."\"\{word}\"(이)라고 외칩니다."));
    }
}

