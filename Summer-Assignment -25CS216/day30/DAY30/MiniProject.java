import java.util.Scanner;

public class MiniProject {
    static Scanner sc = new Scanner(System.in);

    // --- Calculator Function ---
    static void calculator() {
        int choice;
        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                switch (choice) {
                    case 1: System.out.println("Result = " + (a + b)); break;
                    case 2: System.out.println("Result = " + (a - b)); break;
                    case 3: System.out.println("Result = " + (a * b)); break;
                    case 4: 
                        if (b != 0) System.out.println("Result = " + (a / b));
                        else System.out.println("Division by zero not allowed!");
                        break;
                }
            }
        } while (choice != 5);
    }

    // --- Array Operations Function ---
    static void arrayOps() {
        int[] arr = new int[50];
        int n = 0, choice;
        do {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: arr[n++] = sc.nextInt(); System.out.println("Inserted!"); break;
                case 2:
                    int del = sc.nextInt(); boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == del) {
                            for (int j = i; j < n - 1; j++) arr[j] = arr[j + 1];
                            n--; found = true; break;
                        }
                    }
                    System.out.println(found ? "Deleted!" : "Not Found!");
                    break;
                case 3:
                    int s = sc.nextInt(); found = false;
                    for (int i = 0; i < n; i++) if (arr[i] == s) { found = true; break; }
                    System.out.println(found ? "Found!" : "Not Found!");
                    break;
                case 4:
                    for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
                    System.out.println();
                    break;
            }
        } while (choice != 5);
    }

    // --- String Operations Function ---
    static void stringOps() {
        int choice;
        do {
            System.out.println("\n--- String Operations ---");
            System.out.println("1. Reverse");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Length");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter string: ");
                String str = sc.nextLine();
                switch (choice) {
                    case 1: System.out.println("Reverse: " + new StringBuilder(str).reverse()); break;
                    case 2: String rev = new StringBuilder(str).reverse().toString();
                            System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome"); break;
                    case 3: System.out.println("Length: " + str.length()); break;
                }
            }
        } while (choice != 4);
    }

    // --- Main Menu ---
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Mini Project Menu ===");
            System.out.println("1. Calculator");
            System.out.println("2. Array Operations");
            System.out.println("3. String Operations");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: calculator(); break;
                case 2: arrayOps(); break;
                case 3: stringOps(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}

