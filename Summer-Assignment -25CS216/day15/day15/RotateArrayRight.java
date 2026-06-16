import java.util.Scanner;

public class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();
        d = d % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + d) % n] = arr[i];
        }

        System.out.print("Array after right rotation: ");
        for (int x : rotated) System.out.print(x + " ");
    }
}

