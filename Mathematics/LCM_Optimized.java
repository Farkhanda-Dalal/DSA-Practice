import java.util.*;

public class LCM_Optimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(LCM(a, b));
    }

    static int GCD(int a,int b){
        if(b==0) return a;
        else return GCD(b, a%b);
    }

    static int LCM(int a, int b){
        return (a*b)/GCD(a, b);
    }
}
