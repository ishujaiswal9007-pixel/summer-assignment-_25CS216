import java.util.*;

class Book {
    int id;
    String name;
    boolean issued = false;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java"));
        books.add(new Book(102, "Python"));
        books.add(new Book(103, "C++"));

        System.out.println("Available Books:");
        for (Book b : books) {
            System.out.println(b.id + " " + b.name);
        }

        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book Issued Successfully");
                return;
            }
        }

        System.out.println("Book Not Available");
    }
}