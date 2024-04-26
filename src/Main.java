import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        myArrayList.addElement(1);
        myArrayList.addElement(2);
        myArrayList.addElement(3);
        myArrayList.addElement(4);
        myArrayList.addElement(5);

        System.out.println("Value of index 3: " + myArrayList.get(3));
        System.out.println("Size of an list: " + myArrayList.getSize());
        System.out.println("Value of index 0 before remove: " + myArrayList.getElement(0));
        myArrayList.remove(0);
        System.out.println("Vaule of index 0 after remove: " + myArrayList.getElement(0));
        System.out.println("Size of an list: " + myArrayList.getSize());
        System.out.println("Vaule of index 2 before remove: " + myArrayList.getElement(2));
        myArrayList.remove(2);
        System.out.println("Vaule of index 2 after remove: " + myArrayList.getElement(2));
        System.out.println("Size of an list: " + myArrayList.getSize());

    }
}