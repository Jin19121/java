package ch06.Exercise.q20;

public class AccountT {
    private String no;
    private String name;
    private int balance;

    public AccountT(String no, String name, int balance) {
        this.no = no;
        this.name = name;
        this.balance = balance;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
