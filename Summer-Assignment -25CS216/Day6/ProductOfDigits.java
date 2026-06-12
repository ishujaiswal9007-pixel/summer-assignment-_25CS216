<<<<<<< HEAD
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num != 0) {
            product *= (num % 10);
            num /= 10;
        }

        System.out.println("Product of digits = " + product);
    }
}
=======
import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num != 0) {
            product *= (num % 10);
            num /= 10;
        }

        System.out.println("Product of digits = " + product);
    }
}
>>>>>>> bd833f47e7a544afbed3e4e2018f32b7471055f1
   