package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("model: " + myPhone.model);
        System.out.println("color: " + myPhone.color);

        System.out.println("wifi: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hello?");
        myPhone.receiveVoice("hi! This is DK here.");
        myPhone.sendVoice("oh, so nice to hear from you.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
