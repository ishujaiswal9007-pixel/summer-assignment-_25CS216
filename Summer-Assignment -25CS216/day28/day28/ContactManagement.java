
import java.util.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Contact> list = new ArrayList<>();

        System.out.print("Enter Contact Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        list.add(new Contact(name, phone));

        System.out.println("\nSaved Contacts");

        for (Contact c : list) {
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
        }
    }
}