import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println(checkPalindrome(no));
    }

    static boolean checkPalindrome(int no){
        boolean flag=false;
        if(revItr(no)==no) return true;
        return flag;
    }

    static int rev(int no){
        StringBuilder rev=new StringBuilder(String.valueOf(no));
        rev.reverse();
        int res=Integer.parseInt(rev.toString());
        return res;
    }

    static int revItr(int no){
        int rev=0;
        while (no>0) {
            rev=(rev*10) + (no%10);
            no/=10;
        }
        return rev;
    }
}