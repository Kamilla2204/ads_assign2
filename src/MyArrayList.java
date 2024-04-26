
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
        Object[] newArr = new Object[arr.length*2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = (T[]) newArr;
    }

    @Override
    public void set(int index, T data) {

    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int index0f(Object object) {
        return 0;
    }

    @Override
    public int lastIndex0f(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
