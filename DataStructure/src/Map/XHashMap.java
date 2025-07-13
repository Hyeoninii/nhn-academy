package Map;

import java.util.HashSet;
import java.util.Set;

public class XHashMap<K, V> implements XMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    
    private Entry<K, V>[] table;
    private int size;
    private final float loadFactor;
    
    @SuppressWarnings("unchecked")
    public XHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }
    
    @SuppressWarnings("unchecked")
    public XHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }
    
    @SuppressWarnings("unchecked")
    public XHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException();
        }
        if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
            throw new IllegalArgumentException();
        }
        
        this.loadFactor = loadFactor;
        this.table = new Entry[initialCapacity];
    }
    
    private void validateKey(K key) {
        if (key == null) {
            throw new NullPointerException("Null key");
        }
    }
    
    private void validateValue(V value) {
        if (value == null) {
            throw new NullPointerException("Null value");
        }
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }
    
    private void resize() {
        if (size < table.length * loadFactor) {
            return;
        }
        
        Entry<K, V>[] oldTable = table;
        table = new Entry[table.length * 2];
        size = 0;
        
        for (Entry<K, V> entry : oldTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }
    
    @Override
    public V put(K key, V value) {
        validateKey(key);
        validateValue(value);
        
        int index = hash(key);
        Entry<K, V> current = table[index];
        
        while (current != null) {
            if (current.key.equals(key)) {
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
        size++;
        
        resize();
        return null;
    }
    
    @Override
    public V get(K key) {
        validateKey(key);
        
        int index = hash(key);
        Entry<K, V> current = table[index];
        
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        
        return null;
    }
    
    @Override
    public boolean containsKey(K key) {
        validateKey(key);
        
        int index = hash(key);
        Entry<K, V> current = table[index];
        
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        
        return false;
    }
    
    @Override
    public boolean containsValue(V value) {
        validateValue(value);
        
        for (Entry<K, V> entry : table) {
            Entry<K, V> current = entry;
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }
        
        return false;
    }
    
    @Override
    public V remove(K key) {
        validateKey(key);
        
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;
        
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        
        return null;
    }
    
    @Override
    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (Entry<K, V> entry : table) {
            Entry<K, V> current = entry;
            while (current != null) {
                keys.add(current.key);
                current = current.next;
            }
        }
        return keys;
    }
    
    @Override
    public Set<V> values() {
        Set<V> values = new HashSet<>();
        for (Entry<K, V> entry : table) {
            Entry<K, V> current = entry;
            while (current != null) {
                values.add(current.value);
                current = current.next;
            }
        }
        return values;
    }
    
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
} 