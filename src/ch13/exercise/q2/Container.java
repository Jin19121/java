package ch13.exercise.q2;

public class Container<T> {
    private T type;

    public T get() {
        return type;
    }

    public void set(T type) {
        this.type = type;
    }
}
