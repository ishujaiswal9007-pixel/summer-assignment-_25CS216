import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String str = sc.nextLine();
        
        String result = str.toUpperCase();
        System.out.println("Uppercase string: " + result);
    }
}

