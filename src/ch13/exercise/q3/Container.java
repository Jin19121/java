package ch13.exercise.q3;

public class Container<K, V> {
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { //문제 내용 상 String 타입으로 해도됨
        return key;
    }

    public V getValue() {
        return value;
    }
}
