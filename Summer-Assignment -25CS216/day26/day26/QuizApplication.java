import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.print("Enter answer: ");
        int ans1 = sc.nextInt();

        if (ans1 == 2) {
            score++;
        }

        System.out.println("\nQ2. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Database");
        System.out.print("Enter answer: ");
        int ans2 = sc.nextInt();

        if (ans2 == 1) {
            score++;
        }

        System.out.println("\nQ3. 5 + 3 = ?");
        System.out.println("1. 6");
        System.out.println("2. 7");
        System.out.println("3. 8");
        System.out.print("Enter answer: ");
        int ans3 = sc.nextInt();

        if (ans3 == 3) {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
}
