<<<<<<< HEAD
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long n = sc.nextLong();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of Digits = " + count);
    }
}
=======
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long n = sc.nextLong();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of Digits = " + count);
    }
}
>>>>>>> bd833f47e7a544afbed3e4e2018f32b7471055f1
