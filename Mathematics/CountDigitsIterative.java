import java.util.Scanner;

class CountDigitsIterative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int no=sc.nextInt();
        System.out.println(count(no));
    }

    static int count(int no){
        int incr=0;
        while(no>0){
            no/=10;
            incr++;
        }
        return incr;
    }
}

//Time Complexity: O(log₁₀ n)
//Space Complexity: O(1)