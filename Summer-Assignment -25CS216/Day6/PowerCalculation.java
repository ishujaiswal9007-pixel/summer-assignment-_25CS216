import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        long result = 1;

        // Loop to calculate x^n
        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        // Output result
        System.out.println(x + " raised to the power " + n + " is: " + result);

        sc.close();
    }
}
