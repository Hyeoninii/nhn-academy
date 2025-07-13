package Queue;

import java.util.*;

public class XPriorityQueue<T> implements XQueue<T> {
    List<T> elements;
    Comparator<T> comparator;

    public XPriorityQueue(Comparator<T> comparator) {
        this.elements = new ArrayList<>();
        this.comparator = comparator;
    }

    @Override
    public boolean enqueue(T element) {
        if (element == null) throw new NullPointerException();

        int index = Collections.binarySearch(elements, element, comparator);
        if (index < 0) index = -index - 1;
        elements.add(index, element);
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException();
        return elements.remove(0);
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new IllegalStateException();
        return elements.get(0);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public XQueue<T> copy() {
        XPriorityQueue<T> newQueue = new XPriorityQueue<>(comparator);
        newQueue.elements.addAll(this.elements);
        return newQueue;
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}
