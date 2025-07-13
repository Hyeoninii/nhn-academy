package Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class XArrayMap<K, V> implements XMap<K, V> {
    Entry<K, V>[] xMap;
    int size;
    
    public XArrayMap() {
        xMap = new Entry[10];
    }

    void checkLength() {
        if (xMap == null || size == xMap.length) {
            int newSize = 0;
            if (xMap != null) {
                newSize = (xMap.length == 0) ? 10 : xMap.length * 2;
            }
            xMap = Arrays.copyOf(xMap, newSize);
        }
    }
    
    void validateKey(K key) {
        if(key==null) {throw new NullPointerException();}
    }
    
    void validateValue(V value) {
        if(value==null) {throw new NullPointerException();}
    }

    @Override
    public V put(K key, V value) {
        validateKey(key);
        validateValue(value);
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                V oldValue = xMap[i].value;
                xMap[i].value = value;
                return oldValue;
            }
        }
        checkLength();
        xMap[size++] = new Entry<>(key, value);
        return null;
    }

    @Override
    public V get(K key) {
        validateKey(key);
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                return xMap[i].value;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        validateKey(key);
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        validateValue(value);
        for (int i = 0; i < size; i++) {
            if (xMap[i].value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V remove(K key) {
        validateKey(key);
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                V temp = xMap[i].value;
                for (int j = i + 1; j < size; j++) {
                    xMap[j - 1] = xMap[j];
                }
                xMap[size - 1] = null;
                size--;
                return temp;
            }
        }
        return null;
    }

    @Override
    public void clear() {
        size = 0;
        xMap = new Entry[10];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(xMap[i].key);
        }
        return set;
    }

    @Override
    public Set<V> values() {
        Set<V> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(xMap[i].value);
        }
        return set;
    }
}

class Entry<K, V> {
    K key;
    V value;
    
    public Entry() {}
    
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}