package ch14.sec06.exam00;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory1(int memory) {
        synchronized (this) {
            this.memory = memory;
        }
    }

    synchronized public void setMemory2(int memory) {
        this.memory = memory;
    }
}
