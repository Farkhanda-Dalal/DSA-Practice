public class GCD_Naive {
    public static void main(String[] args) {
        int a=9;
        int b=10;
        int res=Math.min(a,b);
        System.out.println(GCD(res, a, b));
    }

    static int GCD(int res,int a, int b){
        if(a%res==0 && b%res==0) return res;
        else{
            res--;
            return GCD(res,a,b);
        }
    }
}
