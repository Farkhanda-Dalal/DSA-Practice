/*Aim of this program is to find to of 0s at end of factorial of a given no
eg: no=5
fact()=120
here no of 0s at end of fact is 1
*/
public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(fact(20));
        System.out.println(trailingZeros(fact(20)));
    }

    static long fact(long no){
        long i=1;
        long fact=1;
        while (i++ <no) {
            fact*=i;
        }
        return fact;
    }

    static long trailingZeros(long fact){
        long zero=0;
        while (fact%10==0) {
            zero++;
            fact/=10;
        }
        return zero;
    }
}
