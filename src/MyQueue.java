import java.util.NoSuchElementException;

public abstract class MyQueue<T> extends MyLinkedList<T>{
    private int size;
    public MyQueue(){
        super();
    }

    public T enqueue(T Item){
       this.addElement(Item);
        return Item;
    }

    public void dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }
        size--;
    }



    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }
        return super.get();
    }

    public  int size(){
        return size();
    }

    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }}