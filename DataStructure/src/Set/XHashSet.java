package Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class XHashSet<T> implements XSet<T> {
    Node<T>[] table;
    int size;
    int capacity;

    public XHashSet() {
        this.capacity = 10;
        this.table = (Node<T>[]) new Node[capacity];
        this.size = 0;
    }

    void validateNull(T data) {
        if(data == null) { throw new NullPointerException(); }
    }

    int hash(T data) {
        return Math.abs(data.hashCode()) % capacity;
    }

    @Override
    public boolean add(T element) {
        validateNull(element);
        if (contains(element)) return false;

        if (size == capacity) resize();

        int idx = hash(element);
        Node<T> newNode = new Node<>(element);
        newNode.next = table[idx];
        table[idx] = newNode;
        size++;
        return true;
    }

    void resize() {
        int newCapacity = capacity * 2;
        Node<T>[] newTable = (Node<T>[]) new Node[newCapacity];

        for (int i = 0; i < capacity; i++) {
            Node<T> current = table[i];
            while (current != null) {
                Node<T> next = current.next;
                int newIndex = Math.abs(current.data.hashCode()) % newCapacity;
                current.next = newTable[newIndex];
                newTable[newIndex] = current;
                current = next;
            }
        }
        table = newTable;
        capacity = newCapacity;
    }

    @Override
    public boolean remove(T element) {
        validateNull(element);
        int idx = hash(element);
        Node<T> current = table[idx];
        Node<T> prev = null;

        while (current != null) {
            if (current.data.equals(element)) {
                if (prev == null) table[idx] = current.next;
                else prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean contains(T element) {
        validateNull(element);
        int idx = hash(element);
        Node<T> current = table[idx];
        while (current != null) {
            if (current.data.equals(element)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        table = (Node<T>[]) new Node[capacity];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            Node<T> current = null;

            @Override
            public boolean hasNext() {
                while (current == null && index < capacity) {
                    current = table[index++];
                }
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

    @Override
    public XSet<T> union(XSet<T> other) {
        XSet<T> result = this.copy();
        for (T elem : other) {
            result.add(elem);
        }
        return result;
    }

    @Override
    public XSet<T> intersection(XSet<T> other) {
        XSet<T> result = new XHashSet<>();
        for (T elem : this) {
            if (other.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }


    @Override
    public XSet<T> difference(XSet<T> other) {
        XSet<T> result = new XHashSet<>();
        for (T elem : this) {
            if (!other.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    @Override
    public XSet<T> symmetricDifference(XSet<T> other) {
        XSet<T> result = new XHashSet<>();
        for (T elem : this) {
            if (!other.contains(elem)) {
                result.add(elem);
            }
        }
        for (T elem : other) {
            if (!this.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    @Override
    public boolean isSubsetOf(XSet<T> other) {
        for (T item : this) {
            if (!other.contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean isSupersetOf(XSet<T> other) {
        for (T item : other) {
            if (!this.contains(item)) return false;
        }
        return true;
    }

    @Override
    public XSet<T> copy() {
        XSet<T> copy = new XHashSet<>();
        for (T elem : this) {
            copy.add(elem);
        }
        return copy;
    }
}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
    }
}