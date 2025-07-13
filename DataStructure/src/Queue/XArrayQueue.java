package Queue;


import java.util.Iterator;

public class XArrayQueue<T> implements XQueue<T> {
    T[] queueArray;
    int front = 0;  //맨 앞 원소 위치
    int rear = 0;   //맨 뒤 원소 위치
    int size = 0;
    int capacity;

    @SuppressWarnings("unchecked")
    public XArrayQueue() {
            this.capacity = 10;
            queueArray = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return size == capacity;
    }

    void validateElement(T element) {
        if(element==null) {throw new NullPointerException();}
    }
    @Override
    public boolean enqueue(T element) {
        validateElement(element);
        if(isFull()) {
            throw new IllegalStateException();
        }
        queueArray[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException();
        }
        T temp = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
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
    @SuppressWarnings("unchecked")
    public void clear() {
        front = rear = size = 0;
        queueArray = (T[]) new Object[capacity];
    }

    @Override
    public XQueue<T> copy() {
        XArrayQueue<T> newQueue = new XArrayQueue<>();
        for(int i=0; i<size; i++) {
            newQueue.enqueue(queueArray[(front+i)%capacity]);
        }
        return newQueue;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;
            int index = front;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                T item = queueArray[index];
                index = (index + 1) % capacity;
                count++;
                return item;
            }
        };
    }
}
