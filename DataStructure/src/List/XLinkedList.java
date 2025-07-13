package List;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.Consumer;

public class XLinkedList<T> implements XList<T> {
    Node<T> first = null;
    int size = 0;

    public XLinkedList() {}

    public XLinkedList(Collection<? extends T> c) {
        this();
        for(T item : c) {
            add(item);
        }
    }

    void validateIndex(int index) {
        if(index>=size||index<0) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }
    void validateNull(T data) {
        if(data == null) { throw new IllegalArgumentException("Null element"); }
    }

    @Override
    public void add(T data) {
        validateNull(data);
        Node<T> newNode = new Node<T>(data);
        if(first == null) {
            first = newNode;
        } else {
            Node<T> temp = first;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T data) {
        validateIndex(index);
        validateNull(data);
        Node<T> newNode = new Node<T>(data);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> temp = first;
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        validateIndex(index);
        Node<T> current;
        if(index == 0) {
            current = first;
            first = first.next;
        }  else {
            Node<T> temp = first;
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            current = temp.next;
            temp.next = current.next;
        }
        size--;

        return current.data;
    }

    @Override
    public boolean remove(T elem) {
        validateNull(elem);
        if (first == null) return false;

        if (first.data.equals(elem)) {
            first = first.next;
            size--;
            return true;
        }

        Node<T> curr = first;
        while (curr.next != null && !curr.next.data.equals(elem)) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
            size--;
            return true;
        }

        return false;
    }

    @Override
    public boolean contains(T elem) {
        validateNull(elem);
        return indexOf(elem) >= 0;
    }

    @Override
    public int indexOf(T elem) {
        validateNull(elem);
        int index = 0;
        Node<T> temp = first;
        while(!(temp.data.equals(elem))) {
            temp = temp.next;
            index++;
        }
        if(index >= size) {
            index = -1;
        }
        return index;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        Node<T> temp = first;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public void set(int index, T element) {
        validateIndex(index);
        validateNull(element);
        Node<T> temp = first;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        temp.data = element;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        first = mergeSort(first, comparator);
    }
    private Node<T> mergeSort(Node<T> node, Comparator<? super T> comp) {
        if (node == null || node.next == null) return node;

        // 중간 노드 찾기
        Node<T> middle = getMiddle(node);
        Node<T> nextToMiddle = middle.next;
        middle.next = null;

        Node<T> left = mergeSort(node, comp);
        Node<T> right = mergeSort(nextToMiddle, comp);

        return merge(left, right, comp);
    }

    private Node<T> merge(Node<T> a, Node<T> b, Comparator<? super T> comp) {
        if (a == null) return b;
        if (b == null) return a;

        Node<T> result;
        if (comp.compare(a.data, b.data) <= 0) {
            result = a;
            result.next = merge(a.next, b, comp);
        } else {
            result = b;
            result.next = merge(a, b.next, comp);
        }
        return result;
    }

    private Node<T> getMiddle(Node<T> node) {
        if (node == null) return null;
        Node<T> slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    @Override
    public XLinkedList<T> subList(int fromIndex, int toIndex) {
        validateIndex(fromIndex);
        validateIndex(toIndex);
        Node<T> temp = first;
        for(int i=0; i<fromIndex; i++) {
            temp = temp.next;
        }
        XLinkedList<T> subList = new XLinkedList<>();
        for(int i=0; i<toIndex; i++) {
            subList.add(temp.data);
        }
        return subList;
    }

    @Override
    public void forEach() {
        for(Node<T> temp = first; temp != null; temp = temp.next) {
            System.out.println(temp.data + " ");
        }
    }

    @Override
    public void addAll(XList<T> otherList) {
        forEach(otherList::add);
    }

    @Override
    public void forEach(Consumer<T> action) {
        for(Node<T> temp = first; temp != null; temp = temp.next) {
            action.accept(temp.data);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0 && first == null) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public XLinkedList<T> copy() {
        XLinkedList<T> temp = new XLinkedList<T>();
        temp.first = first;
        temp.size = size;
        return temp;
    }

}

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
    }
}
