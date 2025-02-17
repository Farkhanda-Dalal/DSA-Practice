import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Search\n2. Insert\n3. Delete\n4. Update");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();

        int[] arr = new int[5]; // Static array of size 5
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 8;
        int filled = 4; // Number of elements currently filled in the array

        switch (ch) {
            case 1:
                // Searching operation
                // Best Case: O(1) (if element is found at the first index)
                // Worst Case: O(n) (if element is at the last index or not present)
                // Average Case: O(n) (for linear search)
                System.out.println("Enter element to be searched:");
                int s = sc.nextInt();
                int search = search(s, arr, filled);
                if (search >= 0) 
                    System.out.println(s + " found at position " + search);
                else 
                    System.out.println("Element not found");
                break;
            case 2:
                // Insertion operation
                // Best Case: O(1) (if inserting at the end without shifting)
                // Worst Case: O(n) (if inserting at the beginning and all elements must shift)
                // Average Case: O(n) (insertion at a random position)
                System.out.println("Enter number and position you want to insert the element at:");
                int ele = sc.nextInt();
                int pos = sc.nextInt();
                int size = insert(ele, pos, arr, filled);
                if (size != -1) {
                    filled = size; // Update the filled count
                    System.out.println("Element inserted successfully.");
                }
                System.out.println(Arrays.toString(arr));
                break;
            case 3:
                // Deletion operation
                // Best Case: O(1) (if deleting the last element, no shifting required)
                // Worst Case: O(n) (if deleting the first element and all elements must shift)
                // Average Case: O(n) (deletion at a random position)
                System.out.println("Enter the element you want to delete:");
                int del = sc.nextInt();
                filled = deletion(del, arr, filled);
                System.out.println(Arrays.toString(arr));
                break;
            case 4:
                // Update operation
                // Best Case: O(1) (if updating the first index)
                // Worst Case: O(n) (if searching for an element first before updating)
                // Average Case: O(1) (if index is known, O(n) if searching first)
                System.out.println("Enter element to be updated and new value:");
                int oldVal = sc.nextInt();
                int newVal = sc.nextInt();
                update(arr, filled, oldVal, newVal);
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        sc.close();
    }

    // Searching function
    public static int search(int s, int[] arr, int filled) {
        for (int i = 0; i < filled; i++) {
            if (arr[i] == s) return i;
        }
        return -1;
    }

    // Insertion function
    public static int insert(int ele, int pos, int[] arr, int filled) {
        if (filled == arr.length) {
            System.out.println("Array is full, cannot perform insertion.");
            return -1;
        }
        if (pos < 1 || pos > filled + 1) {
            System.out.println("Invalid position.");
            return -1;
        }

        for (int i = filled - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = ele;
        return ++filled;
    }

    // Deletion function
    public static int deletion(int del, int[] arr, int filled) {
        boolean found = false;
        for (int i = 0; i < filled; i++) {
            if (arr[i] == del) {
                found = true;
                for (int j = i; j < filled - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[filled - 1] = 0; // Optional: Reset last element to 0
                return filled - 1; // Reduce filled count
            }
        }
        if (!found) {
            System.out.println("Element to be deleted is not found.");
        }
        return filled;
    }

    // Update function
    public static void update(int[] arr, int filled, int oldVal, int newVal) {
        boolean found = false;
        for (int i = 0; i < filled; i++) {
            if (arr[i] == oldVal) {
                arr[i] = newVal;
                found = true;
                System.out.println("Element updated successfully.");
                return;
            }
        }
        if (!found) {
            System.out.println("Element to be updated not found.");
        }
    }
}
