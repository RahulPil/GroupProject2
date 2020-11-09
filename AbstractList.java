import java.util.*;

public abstract class AbstractList<E> implements List<E> {
    protected int size; // current number of elements in the list

    //returns num of elements in list
    public int size() {
        return size;
    }

    //returns value at given index in list
    public E get(int index) {
        checkIndex(index);
        E value = null;
        Iterator<E> itr = this.iterator();
        for (int i = 0; i <= index; i++) {
           value = itr.next();
        }
        return value;
    }

    //verifies that the index is in bounds of the list
    protected void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    //returns a string representation of the list
    public String toString() {
        if (this.isEmpty()) return "[]";
        else {
            String str = "[";
            Iterator<E> itr = this.iterator();
            str += itr.next();
            while (itr.hasNext()) {
                str += ", " + itr.next();
            }
            str += "]";
            return str;
        }
    }

    //returns the index of the first occurrence of the given value
    //returns -1 if not found
    public abstract int indexOf(E value);

    //returns true if the list is empty
    public boolean isEmpty() { return size == 0; }

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
    public void remove(int index){
      checkIndex(index);
      Iterator<E> itr = this.iterator();
      for(int i = 0; i < index; i++){
         itr.next();
      }
      itr.remove();
   }
   

    //replaces the current value at the index with the given value
    public void set(int index, E value){
        remove(index);     
        add(index, value);
    }

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
