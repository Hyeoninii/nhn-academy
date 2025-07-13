package Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class XLinkedStack<T> implements XStack<T> {
    Node<T> top;
    int size = 0;


    @Override
    public void push(T element) {
        Objects.requireNonNull(element, "Value cannot be null");
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new NoSuchElementException();
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
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