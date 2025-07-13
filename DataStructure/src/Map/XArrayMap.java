package Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class XArrayMap<K, V> implements XMap<K, V> {
    Entry[] xMap;
    int size;
    public XArrayMap() {
        xMap = new Entry[10];
    }

    void checkLength() {
        if (xMap == null || size == xMap.length) {
            int newSize = (xMap.length == 0) ? 10 : xMap.length * 2;
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
    public void put(K key, V value) {
        validateKey(key);
        validateValue(value);
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                xMap[i].value = value;
                return;
            }
        }
        checkLength();
        xMap[size++] = new Entry<>(key, value);
    }

    @Override
    public V get(K key) {
        for (Entry v : xMap) {
            if (v == null) continue;
            if (v.key.equals(key)) {
                return (V) v.value;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        for (Entry v : xMap) {
            if (v == null) continue;
            if (v.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (Entry v : xMap) {
            if (v == null) continue;
            if (v.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (xMap[i].key.equals(key)) {
                V temp = (V) xMap[i].value;
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
        if(size == 0) { return true; }
        return false;
    }

    @Override
    public Set keySet() {
        Set set = new HashSet();
        for (int i = 0; i < size; i++) {
            set.add(xMap[i].key);
        }
        return set;
    }

    @Override
    public Set values() {
        Set set = new HashSet();
        for (int i = 0; i < size; i++) {
            set.add(xMap[i].value);
        }
        return set;
    }
}

class Entry<K, V> {
    K  key;
    V value;
    public Entry() {}
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        XMap<String, Integer> map = new XArrayMap<>();

// 요소 추가
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map.get("Alice")); // 출력: 25

// 키 존재 여부 확인
        System.out.println(map.containsKey("Bob")); // 출력: true
        System.out.println(map.containsValue(40)); // 출력: false

// 요소 삭제
        map.remove("Charlie");
        System.out.println(map.containsKey("Charlie")); // 출력: false

// 모든 키와 값 출력
        System.out.println("Keys: " + map.keySet()); // 출력: [Alice, Bob]
        System.out.println("Values: " + map.values()); // 출력: [25, 30]

// 전체 삭제 후 확인
        map.clear();
        System.out.println(map.isEmpty()); // 출력: true

    }
}