import java.util.*;

public class LCM_Naive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=Math.max(a, b);
        boolean ans=true;

        while (ans) {
            if(res%a==0 && res%b==0) ans=false;
            else res++;
        }
        System.out.println(res);
        
    }
}
