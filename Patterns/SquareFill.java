// Java Program to print
// Square fill pattern
import java.util.*;

public class SquareFill {

    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
        int i, j;

        // outer loop to handle rows
        for (i = 0; i <= n; i++) {

            // inner loop to handle columns
            for (j = 0; j <= n; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
