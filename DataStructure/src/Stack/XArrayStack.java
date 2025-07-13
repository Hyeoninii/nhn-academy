package Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class XArrayStack<T> implements XStack<T> {
    int capacity = 10;
    T[] array;
    int size;

    public XArrayStack() {
        array = (T[]) new Object[capacity];
        size = 0;
    }


    @Override
    public void push(T element) {
        Objects.requireNonNull(element, "Value cannot be null");
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T item = array[--size];
        array[size] = null;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return array[size-1];
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
        array = (T[]) new Object[capacity];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = size-1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[index--];
            }
        };
    }
}