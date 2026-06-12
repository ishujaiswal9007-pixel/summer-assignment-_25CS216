<<<<<<< HEAD
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci Term = 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci Term = 1");
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Term = " + c);
        }

        sc.close();
    }
=======
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci Term = 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci Term = 1");
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci Term = " + c);
        }

        sc.close();
    }
>>>>>>> bd833f47e7a544afbed3e4e2018f32b7471055f1
}