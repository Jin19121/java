package ch16.sec03;

public class Person {
    public void action1(Workable workable) {
        workable.work("이도겸", "가수");
    }

    public void action2(Speakable speakable) {
        speakable.speak("캐럿들 안녕!");
    }

}

