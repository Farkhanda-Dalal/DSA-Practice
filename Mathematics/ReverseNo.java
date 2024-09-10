import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println("No reversed using Interation="+rev(no));
        System.out.println("No reversed using String Builder="+revStringBuilder(no));
    }

    static int rev(int no){
        int rev,rem;
        rev=rem=0;
        while (no>0) {
            rem=no%10;
            rev=(rev*10)+rem;
            no/=10;
        }
        return rev;
    }

    static int revStringBuilder(int no){
        StringBuilder sb=new StringBuilder(String.valueOf(no));
        sb.reverse();
        int reverse=Integer.parseInt(sb.toString());
        return no;
    }
}
