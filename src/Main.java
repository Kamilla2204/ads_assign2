public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();



        // Add elements to the list
        myList.addElement(1);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5);

        // Print the value at index 3
        System.out.println("Value at index 3: " + myList.get(3));

        // Print the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Print the value at index 0 before removal
        System.out.println("Value at index 0 before removal: " + myList.get(0));

        // Remove an element at index 0
        myList.remove(0);

        // Print the value at index 0 after removal
        System.out.println("Value at index 0 after removal: " + myList.get(0));

        // Print the size of the list after removal
        System.out.println("Size of the list: " + myList.size());

        // Print the value at index 2 before removal
        System.out.println("Value at index 2 before removal: " + myList.get(2));

        // Remove an element at index 2
        myList.remove(2);

        // Print the value at index 2 after removal
        System.out.println("Value at index 2 after removal: " + myList.get(2));

        // Print the size of the list after removal
        System.out.println("Size of the list: " + myList.size());


    }
}
