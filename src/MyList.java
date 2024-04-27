public interface MyList<T> extends Iterable<T> {
    void addElement(T item);
    void set(int index, T item);
    void add (T data);
    void addFirst(T item);
    void addLast(T item);
    T get ();

    T get(int index);

    T getFirst();
    T getLast();
    void remove (int index);
    void removeFirst();
    void removeLast ();
    void sort();
    int index0f(Object object);
    int lastIndex0f(Object object);
    boolean exists (Object object);
    public Object[] toArray();
    void clear();
    int size();


}