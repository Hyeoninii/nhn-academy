package Test;

import Map.XArrayMap;
import Map.XMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * XArrayMap 클래스의 JUnit 테스트 클래스입니다.
 *
 * 이 클래스는 XArrayMap 클래스의 모든 메서드를 테스트합니다.
 * 각 테스트 메서드는 XArrayMap 클래스의 메서드가 올바르게 동작하는지 확인합니다.
 *
 * @author 작성자 이름
 */
class XArrayMapTest {
    private XMap<String, Integer> map;

    /**
     * 각 테스트 메서드 실행 전에 호출됩니다.
     * XArrayMap 인스턴스를 초기화합니다.
     */
    @BeforeEach
    void setUp() {
        map = new XArrayMap<>();
    }

    /**
     * XArrayMap에 요소를 추가하는 메서드를 테스트합니다.
     *
     * 이 테스트는 XArrayMap에 요소를 추가하고, 추가된 요소가 올바르게 저장되는지 확인합니다.
     */
    @Test
    void testPut() {
        Integer result = map.put("Alice", 25);
        assertNull(result); // 새로운 키이므로 null 반환
        assertEquals(1, map.size());
        assertEquals(25, map.get("Alice"));
    }

    /**
     * XArrayMap에 기존 키로 값을 업데이트하는 메서드를 테스트합니다.
     *
     * 이 테스트는 기존 키에 새로운 값을 넣으면 이전 값이 반환되는지 확인합니다.
     */
    @Test
    void testPutUpdate() {
        map.put("Alice", 25);
        Integer oldValue = map.put("Alice", 30);
        assertEquals(25, oldValue); // 이전 값 반환
        assertEquals(30, map.get("Alice")); // 새로운 값으로 업데이트
        assertEquals(1, map.size()); // 크기는 변하지 않음
    }

    /**
     * XArrayMap에서 null 키를 추가하는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 키를 추가하려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testPutNullKey() {
        assertThrows(NullPointerException.class, () -> map.put(null, 25));
    }

    /**
     * XArrayMap에서 null 값을 추가하는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 값을 추가하려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testPutNullValue() {
        assertThrows(NullPointerException.class, () -> map.put("Alice", null));
    }

    /**
     * XArrayMap에서 특정 키의 값을 가져오는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하는 키에 대해 올바른 값을 반환하는지 확인합니다.
     */
    @Test
    void testGet() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        assertEquals(25, map.get("Alice"));
        assertEquals(30, map.get("Bob"));
    }

    /**
     * XArrayMap에서 존재하지 않는 키의 값을 가져오는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하지 않는 키에 대해 null을 반환하는지 확인합니다.
     */
    @Test
    void testGetNonExistentKey() {
        assertNull(map.get("Alice"));
    }

    /**
     * XArrayMap에서 null 키로 값을 가져오는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 키로 값을 가져오려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testGetNullKey() {
        assertThrows(NullPointerException.class, () -> map.get(null));
    }

    /**
     * XArrayMap에서 특정 키가 존재하는지 확인하는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하는 키에 대해 true를 반환하는지 확인합니다.
     */
    @Test
    void testContainsKey() {
        map.put("Alice", 25);
        assertTrue(map.containsKey("Alice"));
        assertFalse(map.containsKey("Bob"));
    }

    /**
     * XArrayMap에서 null 키가 존재하는지 확인하는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 키로 확인하려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testContainsKeyNull() {
        assertThrows(NullPointerException.class, () -> map.containsKey(null));
    }

    /**
     * XArrayMap에서 특정 값이 존재하는지 확인하는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하는 값에 대해 true를 반환하는지 확인합니다.
     */
    @Test
    void testContainsValue() {
        map.put("Alice", 25);
        map.put("Bob", 30);
        assertTrue(map.containsValue(25));
        assertTrue(map.containsValue(30));
        assertFalse(map.containsValue(35));
    }

    /**
     * XArrayMap에서 null 값이 존재하는지 확인하는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 값으로 확인하려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testContainsValueNull() {
        assertThrows(NullPointerException.class, () -> map.containsValue(null));
    }

    /**
     * XArrayMap에서 특정 키를 제거하는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하는 키를 제거하고 해당 값을 반환하는지 확인합니다.
     */
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

    /**
     * XArrayMap에서 존재하지 않는 키를 제거하는 메서드를 테스트합니다.
     *
     * 이 테스트는 존재하지 않는 키를 제거하려고 하면 null을 반환하는지 확인합니다.
     */
    @Test
    void testRemoveNonExistentKey() {
        assertNull(map.remove("Alice"));
    }

    /**
     * XArrayMap에서 null 키를 제거하는 메서드를 테스트합니다.
     *
     * 이 테스트는 null 키를 제거하려고 하면 NullPointerException이 발생하는지 확인합니다.
     */
    @Test
    void testRemoveNullKey() {
        assertThrows(NullPointerException.class, () -> map.remove(null));
    }

    /**
     * XArrayMap을 비우는 메서드를 테스트합니다.
     *
     * 이 테스트는 clear 메서드가 맵을 비우는지 확인합니다.
     */
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

    /**
     * XArrayMap의 크기를 반환하는 메서드를 테스트합니다.
     *
     * 이 테스트는 맵의 크기가 올바르게 반환되는지 확인합니다.
     */
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

    /**
     * XArrayMap이 비어있는지 확인하는 메서드를 테스트합니다.
     *
     * 이 테스트는 맵이 비어있는지 여부가 올바르게 반환되는지 확인합니다.
     */
    @Test
    void testIsEmpty() {
        assertTrue(map.isEmpty());
        map.put("Alice", 25);
        assertFalse(map.isEmpty());
        map.remove("Alice");
        assertTrue(map.isEmpty());
    }

    /**
     * XArrayMap의 모든 키를 반환하는 메서드를 테스트합니다.
     *
     * 이 테스트는 맵의 모든 키가 올바르게 반환되는지 확인합니다.
     */
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

    /**
     * XArrayMap의 모든 값을 반환하는 메서드를 테스트합니다.
     *
     * 이 테스트는 맵의 모든 값이 올바르게 반환되는지 확인합니다.
     */
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

    /**
     * XArrayMap의 확장 기능을 테스트합니다.
     *
     * 이 테스트는 맵이 초기 용량을 초과할 때 올바르게 확장되는지 확인합니다.
     */
    @Test
    void testExpansion() {
        // 초기 용량(10)을 초과하는 요소들을 추가
        for (int i = 0; i < 15; i++) {
            map.put("Key" + i, i);
        }
        
        assertEquals(15, map.size());
        for (int i = 0; i < 15; i++) {
            assertEquals(i, map.get("Key" + i));
        }
    }

    /**
     * XArrayMap의 복합 기능을 테스트합니다.
     *
     * 이 테스트는 여러 메서드를 조합하여 사용할 때 올바르게 동작하는지 확인합니다.
     */
    @Test
    void testComplexOperations() {
        // 요소 추가
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        
        // 키 존재 확인
        assertTrue(map.containsKey("Alice"));
        assertFalse(map.containsKey("David"));
        
        // 값 존재 확인
        assertTrue(map.containsValue(25));
        assertFalse(map.containsValue(40));
        
        // 값 업데이트
        Integer oldValue = map.put("Alice", 26);
        assertEquals(25, oldValue);
        assertEquals(26, map.get("Alice"));
        
        // 요소 제거
        Integer removedValue = map.remove("Bob");
        assertEquals(30, removedValue);
        assertEquals(2, map.size());
        
        // 키셋과 값셋 확인
        Set<String> keys = map.keySet();
        Set<Integer> values = map.values();
        assertEquals(2, keys.size());
        assertEquals(2, values.size());
        
        // 전체 삭제
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0, map.size());
    }
} 