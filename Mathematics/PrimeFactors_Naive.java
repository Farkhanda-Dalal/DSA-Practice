import java.util.*;

public class PrimeFactors_Naive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int a=sc.nextInt();
        primeFactors(a);
    }

    static boolean isPrime(int no){
        if(no==2 || no==3)return true;
        else if(no<=1 || no%2==0 || no%3==0)return false;
        else{
            for (int i = 5; i <=Math.sqrt(no); i+=6) {
                if(no%i==0 || no%(i+2)==0)return false;
            }
        }
        return true;
    }

    static void primeFactors(int no){
        for (int i = 2; i <=no; i++) {
            if(isPrime(i)){
                int x=i;
                while(no%x==0){
                    System.out.println(i);
                    x*=i;
                }
            }
        }
    }
}