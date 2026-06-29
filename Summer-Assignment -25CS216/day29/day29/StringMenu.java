import java.util.Scanner;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String str;

        do {
            System.out.println("\n--- String Menu ---");
            System.out.println("1. Reverse");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Length");
            System.out.println("4. Frequency of Character");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter string: ");
                str = sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Reverse: " + new StringBuilder(str).reverse());
                        break;
                    case 2:
                        String rev = new StringBuilder(str).reverse().toString();
                        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
                        break;
                    case 3:
                        System.out.println("Length: " + str.length());
                        break;
                    case 4:
                        System.out.print("Enter character: ");
                        char ch = sc.next().charAt(0);
                        int freq = 0;
                        for (char c : str.toCharArray()) if (c == ch) freq++;
                        System.out.println("Frequency: " + freq);
                        break;
                }
            }
        } while (choice != 5);
        sc.close();
    }
}

