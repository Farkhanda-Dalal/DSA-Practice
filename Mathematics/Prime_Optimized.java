import java.util.*;

public class Prime_Optimized {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        System.out.println(prime(a));
    }

    static boolean prime(int no){
        if(no==2 || no==3)return true;
        else if(no<=1 || no%2==0 || no%3==0)return false;
        else{
            for (int i = 5; i <= Math.sqrt(no); i+=6) {
                System.out.println(i);
                if(no%i==0 || no%(i+2)==0){
                    return false;
                }
            }
        }
        

        return true;
    }
}
