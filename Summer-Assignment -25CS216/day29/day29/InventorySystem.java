import java.util.Scanner;

class Item {
    String name;
    int quantity;
    double price;
}

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[50];
        int count = 0, choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Delete Item");
            System.out.println("4. Display Items");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    items[count] = new Item();
                    System.out.print("Enter name: ");
                    items[count].name = sc.next();
                    System.out.print("Enter quantity: ");
                    items[count].quantity = sc.nextInt();
                    System.out.print("Enter price: ");
                    items[count].price = sc.nextDouble();
                    count++;
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String nm = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (items[i].name.equals(nm)) {
                            System.out.print("Enter new quantity: ");
                            items[i].quantity = sc.nextInt();
                            System.out.println("Updated!");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter item name to delete: ");
                    nm = sc.next();
                    for (int i = 0; i < count; i++) {
                        if (items[i].name.equals(nm)) {
                            for (int j = i; j < count - 1; j++) items[j] = items[j + 1];
                            count--;
                            System.out.println("Deleted!");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < count; i++)
                        System.out.println(items[i].name + " | Qty: " + items[i].quantity + " | Price: " + items[i].price);
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}

