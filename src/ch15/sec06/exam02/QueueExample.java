package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "SCOUPS"));
        messageQueue.offer(new Message("sendSMS", "DK"));
        messageQueue.offer(new Message("sendKakaotalk", "Boo"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail" -> System.out.println(message.to + "님에게 메일을 보냈습니다.");
                case "sendSMS" -> System.out.println(message.to + "님에게 SMS를 보냈습니다.");
                case "sendKakaotalk" -> System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
            }
        }
    }
}
