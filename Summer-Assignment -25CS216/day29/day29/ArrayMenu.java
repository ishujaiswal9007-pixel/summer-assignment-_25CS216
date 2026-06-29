import java.util.Scanner;

public class ArrayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        int n = 0, choice;

        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    arr[n++] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == del) {
                            for (int j = i; j < n - 1; j++) arr[j] = arr[j + 1];
                            n--; found = true; break;
                        }
                    }
                    System.out.println(found ? "Deleted!" : "Not found!");
                    break;
                case 3:
                    System.out.print("Enter element to search: ");
                    int s = sc.nextInt();
                    found = false;
                    for (int i = 0; i < n; i++) if (arr[i] == s) { found = true; break; }
                    System.out.println(found ? "Found!" : "Not found!");
                    break;
                case 4:
                    System.out.print("Array: ");
                    for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}

