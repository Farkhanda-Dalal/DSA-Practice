import java.util.Scanner;

public class FactorialRecurrsive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println(factRecur(no));
    }

    static int factRecur(int no){
        if(no==1 || no==0) return 1;
        else return no*factRecur(no-1);
    }
}
