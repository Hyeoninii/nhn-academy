package Queue;


import java.util.Iterator;

public class XArrayQueue<T> implements XQueue<T> {

    @Override
    public boolean enqueue(T element) {
        return false;
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public XQueue<T> copy() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
