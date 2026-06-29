import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean issued;
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[50];
        int count = 0, choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Add Book
                    books[count] = new Book();
                    System.out.print("Enter title: ");
                    books[count].title = sc.nextLine();
                    System.out.print("Enter author: ");
                    books[count].author = sc.nextLine();
                    books[count].issued = false;
                    count++;
                    System.out.println("Book added!");
                    break;

                case 2: // Issue Book
                    System.out.print("Enter title to issue: ");
                    String t = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].title.equalsIgnoreCase(t) && !books[i].issued) {
                            books[i].issued = true;
                            System.out.println("Book issued!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not available!");
                    break;

                case 3: // Return Book
                    System.out.print("Enter title to return: ");
                    t = sc.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].title.equalsIgnoreCase(t) && books[i].issued) {
                            books[i].issued = false;
                            System.out.println("Book returned!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found or not issued!");
                    break;

                case 4: // Search Book
                    System.out.print("Enter title to search: ");
                    t = sc.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (books[i].title.equalsIgnoreCase(t)) {
                            System.out.println("Title: " + books[i].title + 
                                               " | Author: " + books[i].author + 
                                               " | Status: " + (books[i].issued ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found!");
                    break;

                case 5: // Display All
                    System.out.println("All Books:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(books[i].title + " | " + books[i].author + " | " + (books[i].issued ? "Issued" : "Available"));
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}

