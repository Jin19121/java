package ch13.exercise.q3;

public class Container<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void set(K key, V value) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }
}
