import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        for (int val : arr1) set1.add(val);

        System.out.println("Intersection of Arrays:");
        for (int val : arr2) {
            if (set1.contains(val)) {
                System.out.print(val + " ");
            }
        }
    }
}

