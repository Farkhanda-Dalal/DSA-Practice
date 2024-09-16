import java.util.*;

class GCD_Euclidean{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(EuclideanOptimized(a, b));
    }

    static int Euclidean(int a,int b){
        while (a!=b) {
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    static int EuclideanOptimized(int a,int b){
        if(b==0) return a;
        else return EuclideanOptimized(b,a%b);
    }
}