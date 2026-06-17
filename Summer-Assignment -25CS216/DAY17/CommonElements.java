import java.util.*;

public class CommonElements {
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

        System.out.print("Enter size of third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements of third array:");
        for (int i = 0; i < n3; i++) arr3[i] = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int val : arr1) set1.add(val);
        for (int val : arr2) set2.add(val);
        for (int val : arr3) set3.add(val);

        System.out.println("Common Elements in all arrays:");
        for (int val : set1) {
            if (set2.contains(val) && set3.contains(val)) {
                System.out.print(val + " ");
            }
        }
    }
}

