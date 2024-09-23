package ch19.lecture.p1network;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class C05Client {
    public static void main(String[] args) throws IOException {
        //키보드 입력 server로 보내기
        Socket socket = new Socket("172.30.1.20", 9999);
        System.out.println("[연결]");

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        PrintStream ps = new PrintStream(bos);

        Scanner scanner = new Scanner(System.in);

        try (scanner; ps; bos; os; socket) {
            System.out.print("이름 입력>");
            String id = scanner.nextLine();
            ps.println(id);
            ps.flush();

            while (true) {
                System.out.print("입력> ");
                String input = scanner.nextLine();
                if (input.equals("종료")) {
                    break;
                }

                ps.println(input);
                ps.flush();
            }
            System.out.println("종료");
        }
    }
}
