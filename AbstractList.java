import java.util.*;

public abstract class AbstractList<E> implements List<E> {
    protected int size; // current number of elements in the list

    //returns num of elements in list
    public int size() {
        return size;
    }

    //returns value at given index in list
    public abstract E get(int index);

    //verifies that the index is in bounds of the list
    public abstract void checkIndex(int index);

    //returns a string representation of the list
    public abstract String toString();

    //returns the index of the first occurrence of the given value
    //returns -1 if not found
    public abstract int indexOf(E value);

    //returns true if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    //returns true if the list contains the value
    public boolean contains(E value){
        return indexOf(value) >= 0;
    }

    //appends the value to the end of the list
    public abstract void add(E value);

    //adds the value at the given index
    //shifts subsequent values right
    public abstract void add(int index, E value);

    //adds the given list to the end of the current list
    public void addAll(List<E> other) {
        for (E value : other) {
            add(value);
        }
    }

    //removes the value at the given index
    abstract public void remove(int index);

    //replaces the current value at the index with the given value
    abstract public void set(int index, E value);

    //empties the list
    public void clear() {
        Iterator<E> itr = this.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
    }

    //returns an iterator starting at the front of the list
    public abstract Iterator<E> iterator();
}
