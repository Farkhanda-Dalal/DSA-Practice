import java.util.*;

public class Prime_Naive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        System.out.println(prime(a));
    }

    static boolean prime(int no){
        if(no==1 || no==2 || no==3)return true;
        else if(no<=1 || no%2==0 || no%3==0)return false;
        else{
            for (int i = 3; i <= Math.sqrt(no); i+=2) {
                System.out.println(i);
                if(no%i==0){
                    return false;
                }
            }
        }
        

        return true;
    }
}
