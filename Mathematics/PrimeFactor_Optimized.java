import java.util.*;

public class PrimeFactor_Optimized {
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
        for (int i = 2; i <=Math.sqrt(no); i++) {
            if(isPrime(i)){
                while(no%i==0){
                    System.out.println(i);
                    no/=i;
                }
            }
        }
        if(no>1)System.out.println(no);
    }
}

