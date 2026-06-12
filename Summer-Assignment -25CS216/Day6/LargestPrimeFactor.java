<<<<<<< HEAD
import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestPrime = -1;

        while (num % 2 == 0) {
            largestPrime = 2;
            num /= 2;
        }

        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestPrime = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestPrime = num;
        }

        System.out.println("Largest Prime Factor = " + largestPrime);
    }
}
=======
import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestPrime = -1;

        while (num % 2 == 0) {
            largestPrime = 2;
            num /= 2;
        }

        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestPrime = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestPrime = num;
        }

        System.out.println("Largest Prime Factor = " + largestPrime);
    }
}
>>>>>>> bd833f47e7a544afbed3e4e2018f32b7471055f1
