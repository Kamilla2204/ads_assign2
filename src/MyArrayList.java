
import java.util.Iterator;
public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public void addElement(T data) {
        if (size == arr.length) {
            increase();
        }
        arr[size] = data;
        size++;
    }

    private void increase() {
        Object[] newArr = new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = (T[]) newArr;
    }

    @Override
    public void set(int index, T data) {
        checkIndex(index);
        arr[index] = data;

    }

    @Override
    public void add(T data) {
        checkIndex(index);
        if (size == arr.length) {
            increase();
        }
        arr[index] = data;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not correct");
        }
    }


    @Override
    public void addFirst(T data) {
        add(data);
    }

    @Override
    public void addLast(T data) {
        arr[size] = data;
        size++;
    }


    @Override
    public T get() {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        return arr[0];
    }

    @Override
    public T getLast() {
        return arr[size - 1];
    }

    @Override
    public void remove(int data) {
        checkIndex(data);
        for (int i = data + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        arr[size - 1] = null;
        size--;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable<T>) arr[i]).compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public int index0f(Object object) {
        for(int i=0;i<size;i++){
            if(arr[i].equals(object))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndex0f(Object object) {
        for(int i=size-1;i>=0;i--){
            if(arr[i].equals(object))
                return i;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        for(int i=0;i<size;i++){
            if(arr[i].equals(object))
                return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }

        };
    }
}
