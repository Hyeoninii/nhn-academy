package Test;

import Map.XTreeMap;
import Map.XMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class XTreeMapTest {
    private XMap<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new XTreeMap<>();
    }

    @Test
    void testPut() {
        Integer result = map.put("Alice", 25);
        assertNull(result);
        assertEquals(1, map.size());
        assertEquals(25, map.get("Alice"));
    }

    @Test
    void testPutUpdate() {
        map.put("Alice", 25);
        Integer oldValue = map.put("Alice", 30);
        assertEquals(25, oldValue);
        assertEquals(30, map.get("Alice"));
        assertEquals(1, map.size());
    }

    @Test
    void testPutNullKey() {
        assertThrows(NullPointerException.class, () -> map.put(null, 25));
    }

    @Test
    void testPutNullValue() {
        assertThrows(NullPointerException.class, () -> map.put("Alice", null));
    }

    @Test
    void testGet() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        assertEquals(25, map.get("Alice"));
        assertEquals(30, map.get("Bob"));
    }

    @Test
    void testGetNonExistentKey() {
        assertNull(map.get("Alice"));
    }

    @Test
    void testGetNullKey() {
        assertThrows(NullPointerException.class, () -> map.get(null));
    }

    @Test
    void testContainsKey() {
        map.put("Alice", 25);
        assertTrue(map.containsKey("Alice"));
        assertFalse(map.containsKey("Bob"));
    }

    @Test
    void testContainsKeyNull() {
        assertThrows(NullPointerException.class, () -> map.containsKey(null));
    }

    @Test
    void testContainsValue() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        assertTrue(map.containsValue(25));
        assertTrue(map.containsValue(30));
        assertFalse(map.containsValue(35));
    }

    @Test
    void testContainsValueNull() {
        assertThrows(NullPointerException.class, () -> map.containsValue(null));
    }

    @Test
    void testRemove() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        Integer removedValue = map.remove("Alice");
        assertEquals(25, removedValue);
        assertEquals(1, map.size());
        assertNull(map.get("Alice"));
        assertEquals(30, map.get("Bob"));
    }

    @Test
    void testRemoveNonExistentKey() {
        assertNull(map.remove("Alice"));
    }

    @Test
    void testRemoveNullKey() {
        assertThrows(NullPointerException.class, () -> map.remove(null));
    }

    @Test
    void testClear() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        assertEquals(2, map.size());
        
        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());
        assertNull(map.get("Alice"));
        assertNull(map.get("Bob"));
    }

    @Test
    void testSize() {
        assertEquals(0, map.size());
        map.put("Alice", 25);
        assertEquals(1, map.size());
        map.put("Bob", 30);
        assertEquals(2, map.size());
        map.remove("Alice");
        assertEquals(1, map.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("Alice", 25);
        assertFalse(map.isEmpty());
        map.remove("Alice");
        assertTrue(map.isEmpty());
    }

    @Test
    void testKeySet() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        Set<String> keys = map.keySet();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("Alice"));
        assertTrue(keys.contains("Bob"));
        assertTrue(keys.contains("Charlie"));
    }

    @Test
    void testValues() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        Set<Integer> values = map.values();
        assertEquals(3, values.size());
        assertTrue(values.contains(25));
        assertTrue(values.contains(30));
        assertTrue(values.contains(35));
    }

    @Test
    void testBSTProperties() {
        for (int i = 0; i < 100; i++) {
            map.put("Key" + i, i);
        }
        
        assertEquals(100, map.size());
        
        for (int i = 0; i < 100; i++) {
            assertEquals(i, map.get("Key" + i));
        }
    }

    @Test
    void testRemoveWithThreeCases() {
        map.put("D", 4);
        map.put("B", 2);
        map.put("F", 6);
        map.put("A", 1);
        map.put("C", 3);
        map.put("E", 5);
        map.put("G", 7);
        
        assertEquals(7, map.size());
        
        map.remove("A");
        assertEquals(6, map.size());
        assertNull(map.get("A"));
        
        map.remove("D");
        assertEquals(5, map.size());
        assertNull(map.get("D"));
        
        map.remove("B");
        assertEquals(4, map.size());
        assertNull(map.get("B"));
    }

    @Test
    void testComplexOperations() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        assertTrue(map.containsKey("Alice"));
        assertFalse(map.containsKey("David"));
        
        assertTrue(map.containsValue(25));
        assertFalse(map.containsValue(40));
        
        Integer oldValue = map.put("Alice", 26);
        assertEquals(25, oldValue);
        assertEquals(26, map.get("Alice"));
        
        Integer removedValue = map.remove("Bob");
        assertEquals(30, removedValue);
        assertEquals(2, map.size());
        
        Set<String> keys = map.keySet();
        Set<Integer> values = map.values();
        assertEquals(2, keys.size());
        assertEquals(2, values.size());
        
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }

    @Test
    void testConstructor() {
        XTreeMap<String, Integer> map1 = new XTreeMap<>();
        assertTrue(map1.isEmpty());
    }

    @Test
    void testIntegerKeys() {
        XTreeMap<Integer, String> intMap = new XTreeMap<>();
        
        intMap.put(3, "Three");
        intMap.put(1, "One");
        intMap.put(2, "Two");
        
        assertEquals(3, intMap.size());
        assertEquals("One", intMap.get(1));
        assertEquals("Two", intMap.get(2));
        assertEquals("Three", intMap.get(3));
        
        Set<Integer> keys = intMap.keySet();
        Integer[] keyArray = keys.toArray(new Integer[0]);
        assertEquals(1, keyArray[0]);
        assertEquals(2, keyArray[1]);
        assertEquals(3, keyArray[2]);
    }

    @Test
    void testRemoveLeafNode() {
        map.put("B", 2);
        map.put("A", 1);
        map.put("C", 3);
        
        map.remove("A");
        assertEquals(2, map.size());
        assertNull(map.get("A"));
        assertEquals(2, map.get("B"));
        assertEquals(3, map.get("C"));
    }

    @Test
    void testRemoveNodeWithOneChild() {
        map.put("B", 2);
        map.put("A", 1);
        map.put("C", 3);
        map.put("D", 4);
        
        map.remove("C");
        assertEquals(3, map.size());
        assertNull(map.get("C"));
        assertEquals(4, map.get("D"));
    }

    @Test
    void testRemoveNodeWithTwoChildren() {
        map.put("D", 4);
        map.put("B", 2);
        map.put("F", 6);
        map.put("A", 1);
        map.put("C", 3);
        map.put("E", 5);
        map.put("G", 7);
        
        map.remove("D");
        assertEquals(6, map.size());
        assertNull(map.get("D"));
        assertTrue(map.containsKey("E"));
        assertTrue(map.containsKey("F"));
        assertTrue(map.containsKey("G"));
    }
} 