import java.util.Scanner;

public class CountDigitsRecursive {

    static int count(int no){
        if(no/10==0) return 1;
        else return 1+ count(no/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println(count(no));
    }
    //Time Complexity: O(log10 n)
    //Space Complexity: O(1)
}


