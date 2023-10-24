package lab3;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable<K, V> {
    private ArrayList<LinkedList<Entry<K, V>>> table;
    private int size;

    public HashTable(int InitCapacity) {
        table = new ArrayList<>(InitCapacity);
        for (int i = 0; i < InitCapacity; i++) {
            table.add(null);
        }
        size = 0;
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table.get(index);
        if (list == null) {
            list = new LinkedList<>();
            table.set(index, list);
        }
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        list.add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table.get(index);
        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> list = table.get(index);
        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    list.remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.size();
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>(10);

        table.put("apple", 1);
        table.put("banana", 2);
        table.put("cherry", 3);

        System.out.println("Значение ключа: " + table.get("apple"));

        table.remove("apple");

        System.out.println("Количество элементов таблицы: " + table.size());
        System.out.println("Пустая таблица: " + table.isEmpty());
    }
}
