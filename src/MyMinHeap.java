public class MyMinHeap<T extends Comparable<T>> {
    MyArrayList<T> heap = new MyArrayList<>();

    public MyMinHeap(){
    }

    public int size(){
        return heap.size();
    }

    public void clear(){
        heap.clear();
    }

    public T getMin(){
        return heap.getFirst();
    }


    public T extractMin(){
        T min = heap.getFirst();
        swap(0, heap.size()-1);
        heap.removeLast();
        heapify(0);
        return min;
    }

    public void insert(T item){
        heap.add(item);
        int i = heap.size() - 1;
        heapify(i);
    }

    private void heapify(int i){
        int left = leftChildOf(i);
        int right = rightChildOf(i);
        int minimum = i;
        if (left < heap.size() && heap.get().compareTo(heap.get()) < 0){
            minimum = left;
        }
        if (right < heap.size() && heap.get().compareTo(heap.get()) < 0){
            minimum = right;
        }
        if (minimum != i){
            swap(i, minimum);
            heapify(minimum);
        }
    }

    private void traverse(int i){
        if (i < heap.size()){
            System.out.println(heap.get());
            traverse(leftChildOf(i));
            traverse(rightChildOf(i));
        }
    }
    public int leftChildOf(int i){
        return 2 * i;
    }                 //left child
    public int rightChildOf(int i){
        return 2 * i + 1;
    }                  //right child
    public int parentOf(int i){
        return i / 2;
    }                // Returns parent
    private void swap(int i, int j) {
        T temp = heap.get();
        heap.set(i, heap.get());
        heap.set(j, temp);
    }               // swapping of two elements
}