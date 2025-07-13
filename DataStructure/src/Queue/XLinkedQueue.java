package Queue;

import java.util.Iterator;
import java.util.function.Consumer;

public class XLinkedQueue<T> implements XQueue<T> {
    Node<T> head;
    Node<T> tail;
    int size = 0;

    void validateNull(T data) {
        if(data == null) { throw new NullPointerException(); }
    }
    @Override
    public boolean enqueue(T element) {
        validateNull(element);
        if(isEmpty()) {
            head = tail = new Node<>(element);
        } else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
        size++;
        return true;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) { throw new IllegalStateException();}
        T data = head.data;
        head = head.next;
        size--;
        if(head == null) tail = null;
        return data;
    }

    @Override
    public T peek() {
        if(isEmpty()) { throw new IllegalStateException();}
        return head.data;
    }

    public void addAll(XLinkedQueue<T> otherList) {
        for (T t : otherList) {
            this.enqueue(t);
        }
    }

    public void forEach(Consumer<? super T> action) {
        for (T item : this) {
            action.accept(item);
        }
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
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public XQueue<T> copy() {
        XQueue<T> newQueue = new XLinkedQueue<>();
        Node<T> current = head;
        while (current != null) {
            newQueue.enqueue(current.data);
            current = current.next;
        }
        return newQueue;
    }

    void addAll(XQueue<T> otherQueue) {
        for (T item : otherQueue) {
            this.enqueue(item);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public T next() {
                T item = current.data;
                current = current.next;
                return item;
            }
        };
    }

}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
    }
}

