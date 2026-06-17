import java.util.*;

public class UnionArrays {
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

        Set<Integer> set = new LinkedHashSet<>();
        for (int val : arr1) set.add(val);
        for (int val : arr2) set.add(val);

        System.out.println("Union of Arrays:");
        for (int val : set) System.out.print(val + " ");
    }
}

