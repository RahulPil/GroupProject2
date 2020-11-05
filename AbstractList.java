import java.util.*;

public class AbstractList<E> implements List<E> {
    private E[] elementData; // list of values
    private int size; // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    private ListNode<E> front; // first value in the list
    private ListNode<E> back; // last value in the list
    private int size; // current number of elements

    public int size() {
        return size;
    }

    public E get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    public int indexOf(E value) {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }

    public void add(E value) {
        ensureCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        // ListNode<E> current = nodeAt(index - 1);
        // ListNode<E> newNode = new ListNode<E>(value, current.next, current);
        // current.next = newNode;
        // newNode.next.prev = newNode;
        

        // ensureCapacity(size + 1);
        // for (int i = size; i >= index + 1; i--) {
        //     elementData[i] = elementData[i - 1];
        // }
        // elementData[index] = value;
        // size++;

    }

    public void addAll(List<E> other) {
        for (E value : other) {
            add(value);
        }
    }

    public void remove(int index) {

    }

    public void set(int index, E value) {

    }

    public void clear(){

    }

    public void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = elementData.length * 2 + 1;
            if (capacity > newCapacity) {
                newCapacity = capacity;
            }
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }
}
