import java.util.Scanner;

class Student {
    String name;
    int roll;
    double marks;
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[50];
        int count = 0, choice;

        do {
            System.out.println("\n--- Student Record Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by Roll");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add Student
                    students[count] = new Student();
                    System.out.print("Enter name: ");
                    students[count].name = sc.next();
                    System.out.print("Enter roll number: ");
                    students[count].roll = sc.nextInt();
                    System.out.print("Enter marks: ");
                    students[count].marks = sc.nextDouble();
                    count++;
                    System.out.println("Student added!");
                    break;

                case 2: // Search Student
                    System.out.print("Enter roll number to search: ");
                    int r = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].roll == r) {
                            System.out.println("Name: " + students[i].name + 
                                               " | Roll: " + students[i].roll + 
                                               " | Marks: " + students[i].marks);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;

                case 3: // Display All
                    System.out.println("All Students:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(students[i].name + " | Roll: " + students[i].roll + " | Marks: " + students[i].marks);
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
