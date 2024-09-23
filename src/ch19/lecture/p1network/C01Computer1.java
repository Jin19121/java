package ch19.lecture.p1network;

import java.io.OutputStream;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws Exception {//throws는 코드 줄이려는 거지 좋은 방식은 아니다
        //...19장 어찌저찌
        //server 기다리는 컴퓨터
        ServerSocket serverSocket = new ServerSocket(9999);

        // Socket으로 연결 필요
        Socket socket = serverSocket.accept(); //client의 연락을 수락

        //18장 입출력
        OutputStream os = socket.getOutputStream(); //소켓에 쓰기
        try (os; serverSocket; socket) {
            os.write('ㅠ'); //한글자만
            os.flush();
        }
    }
}
