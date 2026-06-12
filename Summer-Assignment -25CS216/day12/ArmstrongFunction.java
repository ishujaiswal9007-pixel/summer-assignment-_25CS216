import java.util.Scanner;

public class ArmstrongFunction {

    static boolean armstrong(int n) {

        int temp=n,sum=0;

        while(n>0) {
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }

        return temp==sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(armstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
