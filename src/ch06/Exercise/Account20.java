package ch06.Exercise;

public class Account20 {
    private int no;
    private String name;
    private int input;
    private int output;
    private int balance;

    public Account20(int no, String name, int balance) {
        this.no = no;
        this.name = name;
        this.balance = balance;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public void setBalance(int balance) {
        balance = balance + input - output;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getInput() {
        return input;
    }

    public int getOutput() {
        return output;
    }

    public int getBalance() {
        return balance;
    }
}
