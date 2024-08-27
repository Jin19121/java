package ch06.Exercise;

public class MemberService {
    boolean login(String id, String pwd) {
        return id.equals("hong") && pwd.equals("12345");
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
