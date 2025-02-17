import java.util.ArrayList;  // Importing ArrayList from java.util package

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(67);
        list.add(77);
        list.add(88);
        list.add(44);

        // Printing the entire list
        System.out.println(list);  // Output: [67, 77, 88, 44]

        // Checking if the list contains the element 77
        System.out.println(list.contains(77));  // Output: true

        // Updating the first element (index 0) with a new value
        list.set(0, 69);
        System.out.println(list);  // Output: [69, 77, 88, 44]

        // Removing the element at index 1 (which is 77)
        list.remove(1);
        System.out.println(list);  // Output: [69, 88, 44]

        // Retrieving and printing the element at index 0
        System.out.println(list.get(0));  // Output: 69

        // Printing the size of the ArrayList
        System.out.println(list.size());  // Output: 3
    }
}
