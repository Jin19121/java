package ch06.Exercise;

public class Q19if {
    public static void main(String[] args) {
        Account19 account = new Account19();

        account.setBalance(10000);
        System.out.println("acount = " + account.getBalance());

        account.setBalance(-100);
        System.out.println(account.getBalance());
    }
}
