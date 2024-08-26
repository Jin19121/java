package ch05.sec05;

public class CharAt {
    public static void main(String[] args) {
        //160p
        String ssn = "9505051230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1', '3' -> System.out.println("M");
            case '2', '4' -> System.out.println("w");
            
        }
    }
}
