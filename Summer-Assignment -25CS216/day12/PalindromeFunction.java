import java.util.Scanner;

public class PalindromeFunction {

    static boolean palindrome(int n) {

        int temp=n, rev=0;

        while(n>0) {
            rev=rev*10+n%10;
            n/=10;
        }

        return temp==rev;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(palindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
