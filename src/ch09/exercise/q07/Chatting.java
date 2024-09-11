package ch09.exercise.q07;

import static java.lang.StringTemplate.STR;

public class Chatting {
    class Chat {
        void start() {
        }

        void sendMessage(String message) {
        }
    }

    void startChat(String chatId) {
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override
            public void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = STR."[\{nickName}]\{inputData}";
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
