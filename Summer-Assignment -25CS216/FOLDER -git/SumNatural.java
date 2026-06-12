import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        long n = sc.nextLong();
        long sum = (n * (n + 1)) / 2;
        System.out.println("Sum: " + sum);
    }
}
	