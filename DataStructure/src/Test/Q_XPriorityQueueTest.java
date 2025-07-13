package Test;


import Queue.XPriorityQueue;
import Queue.XQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q_XPriorityQueueTest {

    @Test
    void testIntegerPriorityQueue() {
        XQueue<Integer> pq = new XPriorityQueue<>(Integer::compareTo); // 오름차순
        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);

        assertEquals(10, pq.dequeue());  // 최소값
        pq.enqueue(5);
        assertEquals(5, pq.peek());
        assertEquals(3, pq.size());
    }

    @Test
    void testStringLengthPriorityQueue() {
        XQueue<String> pq = new XPriorityQueue<String>((a, b) -> b.length() - a.length());
        pq.enqueue("apple");
        pq.enqueue("banana");
        pq.enqueue("kiwi");

        assertEquals("banana", pq.dequeue());
        assertEquals("apple", pq.peek());
    }

    @Test
    void testEmptyDequeue() {
        XQueue<Integer> pq = new XPriorityQueue<>(Integer::compareTo);
        assertThrows(IllegalStateException.class, pq::dequeue);
    }

    @Test
    void testEmptyPeek() {
        XQueue<Integer> pq = new XPriorityQueue<>(Integer::compareTo);
        assertThrows(IllegalStateException.class, pq::peek);
    }

    @Test
    void testCopy() {
        XQueue<Integer> pq = new XPriorityQueue<>(Integer::compareTo);
        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(2);

        XQueue<Integer> copy = pq.copy();
        assertEquals(3, copy.size());
        assertEquals(pq.peek(), copy.peek());
        assertNotSame(pq, copy);
    }

    @Test
    void testClear() {
        XQueue<Integer> pq = new XPriorityQueue<>(Integer::compareTo);
        pq.enqueue(1);
        pq.enqueue(2);
        pq.clear();
        assertTrue(pq.isEmpty());
    }
}

