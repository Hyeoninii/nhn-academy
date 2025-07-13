package List;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.function.Consumer;

public class XArrayList<T> implements XList<T> {
    //ArrayList의 길이는 사용자 정의
    T[] arrList;
    int length=0;
    Class<T> type;
    public XArrayList() {
        arrList = (T[]) Array.newInstance(Object.class, 10);
        type = (Class<T>) Object.class;
    }

    public XArrayList(Class<T> type) {
        this.type = type;
        arrList = (T[]) Array.newInstance(type, 10);
    }

    void increaseCapacity() {
        T[] newArrList = (T[]) Array.newInstance(this.type, length*2);
        for(int i=0; i<length; i++) {
            newArrList[i] = arrList[i];
        }
        arrList = newArrList;
    }
    void validateCapacity() {
        if(length==arrList.length) {
            increaseCapacity();
        }
    }

    void validateElem(T elem) {
        if(elem == null) { throw new IllegalArgumentException("Null element"); }
    }

    void validateIndex(int index) {
        if(index>=length||index<0) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+length);
        }
    }
    @Override
    public void add(T t) {
        validateElem(t);
        validateCapacity();
        arrList[length] = t;
        length++;
    }

    @Override
    public void add(int index, T element) {
        validateElem(element);
        validateIndex(index);
        validateCapacity();
        for(int i=length; i>index; i--) {
            arrList[i] = arrList[i-1];
        }
        arrList[index] = element;
        length++;
    }
    public T remove(int index) {
        validateIndex(index);
        T removedElement = arrList[index];
        for(int i=index; i<length-1; i++) {
            arrList[i] = arrList[i+1];
        }
        length--;
        return removedElement;
    }
    public boolean remove(T element) {
        if(indexOf(element)!=-1) {
            remove(indexOf(element));
            return true;
        }
        return false;
    }


    public boolean contains(T element) {
        validateElem(element);
        for(int i=0; i<length; i++) {
            if(arrList[i].equals(element)) {
                return true;
            }
        }
        return false;
    }


    public int indexOf(T element) {
        validateElem(element);
        for(int i=0; i<length; i++) {
            if(arrList[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }


    public T get(int index) {
        validateIndex(index);
        return arrList[index];
    }


    public void set(int index, T element) {
        validateElem(element);
        validateIndex(index);
        arrList[index] = element;
    }


    public void sort(Comparator<T> comparator) {
        for(int i=0; i<length; i++) {
            for(int j=i+1; j<length; j++) {
                if(comparator.compare(arrList[i], arrList[j])>0) {
                    T temp = arrList[i];
                    arrList[i] = arrList[j];
                    arrList[j] = temp;
                }
            }
        }
    }


    public XList<T> subList(int fromIndex, int toIndex) {
        if(fromIndex>toIndex) { throw(new IllegalArgumentException("fromIndex > toIndex"));}
        validateIndex(fromIndex);
        validateIndex(toIndex);
        XArrayList<T> sub = new XArrayList<>(type);
        for(int i=fromIndex; i<toIndex; i++) {
            sub.add(arrList[i]);
        }
        return sub;
    }

    @Override
    public void forEach(Consumer<T> action) {
        for(int i=0; i<length; i++) {
            action.accept(arrList[i]);
        }
    }

    @Override
    public void addAll(XList<T> otherList) {
        for(int i=0; i<otherList.size(); i++) {
            add(otherList.get(i));
        }
    }


    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        if(length==0) {
            return true;
        }
        return false;
    }


    public void clear() {
        length=0;
    }


    public XList<T> copy() {
        XArrayList<T> temp = new XArrayList<>(type);
        for(int i=0; i<length; i++) {
            temp.add(arrList[i]);
        }
        return temp;
    }
}